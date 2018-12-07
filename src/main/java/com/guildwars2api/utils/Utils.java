package com.guildwars2api.utils;

public class Utils {

    public static String normalizeJson(String str){
        return str.substring(1,str.length()-1)
                .replace("\n","")
                .replace(",  ",",")
                .replace("\"","")
                .trim();
    }

    public static String normalizeJsonListItem(String str){
        return str.replace("[","")
                .replace("]","")
                .replace("\n","")
                .replace("\"","")
                .trim();
    }
}
