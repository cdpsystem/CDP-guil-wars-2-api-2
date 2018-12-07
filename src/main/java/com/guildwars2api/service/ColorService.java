package com.guildwars2api.service;

import com.google.gson.Gson;
import com.guildwars2api.config.APIOptions;
import com.guildwars2api.connector.ApiConnector;
import com.guildwars2api.model.color.Color;
import com.guildwars2api.utils.Utils;

import java.io.IOException;

public class ColorService {

    private ApiConnector apc;
    private Gson gson = new Gson();

    public ColorService(ApiConnector apc) {
        this.apc = apc;
    }

    public String getColorList() throws IOException{
        return apc.getResponseV2(APIOptions.COLORS);
    }

    public Color[] getColors() throws IOException {
        Color[] colors;
        StringBuilder sb = new StringBuilder();
        for(String colorId : getColorList().split(",")){
            sb.append(Utils.normalizeJsonListItem(colorId)+",");
        }
        colors = gson.fromJson(apc.getResponseV2(APIOptions.COLORS,"?ids=" + sb.toString()),Color[].class);

        return colors;
    }
}
