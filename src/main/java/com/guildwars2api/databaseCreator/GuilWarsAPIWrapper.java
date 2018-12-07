package com.guildwars2api.databaseCreator;


import com.google.gson.Gson;
import com.guildwars2api.config.APIOptions;
import com.guildwars2api.config.Config;
import com.guildwars2api.model.item.Item;
import com.opencsv.CSVWriter;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class GuilWarsAPIWrapper {

    public static String getResponse(String urlPart) throws IOException{
        System.out.println("URL Evaluada -> " + APIOptions.HTTP_BASE_URL +  urlPart);
        Connection apiConection = Jsoup.connect(APIOptions.HTTP_BASE_URL +  urlPart)
                .header("Authorization","Bearer " + Config.API_KEY.toString());
        return apiConection.ignoreContentType(true).timeout(10000).execute().body();
    }



    public static String getItems() throws IOException {

        Gson gson = new Gson();

        int contador = 0,
                contador2=0;
        String idGroup = "",
                itemList;

        String[] listaIdsArray;

        ArrayList<String> arListaDescripciones = new ArrayList<>();
        ArrayList<Item[]>  arItemParsed = new ArrayList<>();
        ArrayList<Item>  finalList = new ArrayList<>();

        itemList = getResponse(APIOptions.API_VERSION2.toString() + APIOptions.ITEMS.toString());

        itemList = itemList
            .replace("\n","")
            .replace("\r","")
            .replace("[","")
            .replace("]","")
            .replace(" ","");

        /** TODO Los ultimos item no son leidos */
        listaIdsArray = itemList.split(",");
        for(String id : listaIdsArray){
            idGroup += id+",";
            contador++;

            if(contador == 149){
                arListaDescripciones.add(getResponse(APIOptions.API_VERSION2.toString() + APIOptions.ITEMS.toString() +"?ids="+idGroup));
                contador = 0;
                idGroup = "";
//                if(contador2 == 5){
//                    break;
//                }
//                contador2++;
            }
        }


        for(String itemGroupString : arListaDescripciones){
            arItemParsed.add(gson.fromJson(itemGroupString,Item[].class));
        }

        for(Item[] itemGroup: arItemParsed){
            finalList.addAll(Arrays.asList(itemGroup));
        }

        Writer writer = Files.newBufferedWriter(Paths.get("./item.csv"));
        CSVWriter csvWriter = new CSVWriter(writer,CSVWriter.DEFAULT_SEPARATOR,CSVWriter.NO_QUOTE_CHARACTER,CSVWriter.DEFAULT_ESCAPE_CHARACTER,CSVWriter.DEFAULT_LINE_END);
        String headers[] = {"id","level","vendor_value","default_skin","chat_link","name","icon","description","type","rarity","flags","game_types","restrictions"};
        csvWriter.writeNext(headers);

        finalList.forEach(item -> {
            csvWriter.writeNext(item.toCSVString());
        });
        csvWriter.close();
        writer.close();
        return "Items encontrados -> " + finalList.size() +
        "\n" + "<pre>"+itemList+"</pre>";
    }

}
