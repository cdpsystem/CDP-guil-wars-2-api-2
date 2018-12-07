package com.guildwars2api.service;

import com.guildwars2api.config.APIOptions;
import com.guildwars2api.connector.ApiConnector;
import com.guildwars2api.model.item.Items;

import java.io.IOException;

public class ItemService {
    private ApiConnector apc;

    public ItemService(ApiConnector apiConnector){
        this.apc = apiConnector;
    }


    public Items getItemList() throws IOException {
        apc.getResponseV2(APIOptions.ITEMS);
        return new Items();
    }



}
