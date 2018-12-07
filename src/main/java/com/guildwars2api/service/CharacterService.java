package com.guildwars2api.service;

import com.google.gson.Gson;
import com.guildwars2api.config.APIOptions;
import com.guildwars2api.connector.ApiConnector;
import com.guildwars2api.model.character.Character;
import com.guildwars2api.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URLEncoder;

public class CharacterService {
    private ApiConnector apc;
    private Gson gson = new Gson();

    Logger logger = LoggerFactory.getLogger(CharacterService.class);

    public CharacterService(ApiConnector apc) {
        this.apc = apc;
    }

    private String getCharacterList() throws IOException {
        return apc.getResponseV2(APIOptions.CHARACTERS);
    }

    public Character[] getCharacters() throws IOException{
        Character[] characters = new Character[2];
        StringBuilder sb = new StringBuilder();

        String[] cs = getCharacterList().split(",");

        for(String characterName : cs){
            characterName = Utils.normalizeJsonListItem(characterName);

            sb.append(URLEncoder.encode(characterName, "UTF-8").replace("+", "%20")+",");
        }

        characters = gson.fromJson(apc.getResponseV2(APIOptions.CHARACTERS,"?ids="+sb.toString()),Character[].class);
        logger.debug("Loaded character info. Total-> " + characters.length);
        return characters;
    }

}
