package com.guildwars2api.service;

import com.google.gson.Gson;
import com.guildwars2api.config.APIOptions;
import com.guildwars2api.connector.ApiConnector;
import com.guildwars2api.model.account.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class AccountService {
    private ApiConnector apc;
    private Gson gson = new Gson();
    Account account;

    Logger logger = LoggerFactory.getLogger(CharacterService.class);

    public AccountService(ApiConnector apc) {
        this.apc = apc;
    }

    public Account getAccount() throws IOException {
        account = gson.fromJson(apc.getResponseV2(APIOptions.ACCOUNT),Account.class);
        return account;
    }
}
