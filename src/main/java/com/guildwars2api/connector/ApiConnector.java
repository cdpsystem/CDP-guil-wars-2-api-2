package com.guildwars2api.connector;

import com.guildwars2api.config.APIOptions;
import com.guildwars2api.config.Config;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import java.io.IOException;

public class ApiConnector {

    private String apiKey;

    public ApiConnector(String apiKey){
        this.apiKey = apiKey;
    }

    public String getResponseV1(APIOptions apo, boolean normalize) throws IOException {
        System.out.println("URL Evaluada -> " + APIOptions.HTTP_BASE_URL +  apo.toString());
        Connection apiConection = Jsoup
                .connect(APIOptions.HTTP_BASE_URL.toString() +  APIOptions.API_VERSION1.toString() + apo.toString())
                .header("Authorization","Bearer " + Config.API_KEY.toString());
        return apiConection.ignoreContentType(true).timeout(10000).execute().body();
    }


    public String getResponseV2(APIOptions apo) throws IOException {
        //System.out.println("URL Evaluada -> " + APIOptions.HTTP_BASE_URL.toString() +  apo.toString() + "/Sorrow%20Ace");
        Connection apiConection = Jsoup
                .connect(APIOptions.HTTP_BASE_URL.toString() +  APIOptions.API_VERSION2.toString() + apo.toString())
                .header("Authorization","Bearer " + Config.API_KEY.toString());
        return apiConection.ignoreContentType(true).timeout(10000).execute().body();
    }

    public String getResponseV2(APIOptions apo,String urlPart) throws IOException {
        //System.out.println("URL Evaluada -> " + APIOptions.HTTP_BASE_URL.toString() +  apo.toString() + urlPart);
        Connection apiConection = Jsoup
                .connect(APIOptions.HTTP_BASE_URL.toString() +  APIOptions.API_VERSION2.toString() + apo.toString() + urlPart)
                .header("Authorization","Bearer " + Config.API_KEY.toString());
        return apiConection.ignoreContentType(true).timeout(10000).execute().body();
    }



    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
