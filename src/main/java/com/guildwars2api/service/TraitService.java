package com.guildwars2api.service;

import com.guildwars2api.config.APIOptions;
import com.guildwars2api.connector.ApiConnector;

import java.io.IOException;

public class TraitService {

    private ApiConnector apc;

    public TraitService(ApiConnector apc) {
        this.apc = apc;
    }

    public String getTraitList() throws IOException {
        return apc.getResponseV2(APIOptions.TRAITS);
    }
}
