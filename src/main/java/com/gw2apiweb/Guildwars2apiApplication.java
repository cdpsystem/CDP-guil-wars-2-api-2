package com.gw2apiweb;


import com.guildwars2api.config.Config;
import com.guildwars2api.model.account.Account;
import com.guildwars2api.model.character.Character;
import com.guildwars2api.connector.ApiConnector;
import com.guildwars2api.model.color.Color;
import com.guildwars2api.service.AccountService;
import com.guildwars2api.service.CharacterService;
import com.guildwars2api.service.ColorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

import static com.guildwars2api.databaseCreator.GuilWarsAPIWrapper.getItems;


@RestController
@SpringBootApplication
public class Guildwars2apiApplication {

	static Logger logger = LoggerFactory.getLogger(Guildwars2apiApplication.class);
	private static StringBuilder sb = new StringBuilder();

	@RequestMapping(value="/test",method = RequestMethod.GET)
	public String test(){
		String items = null;
		try {
			items = getItems();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return items;
	}

	public static void main(String[] args)
	{
		// Linea default para arrancar Spring
		SpringApplication.run(Guildwars2apiApplication.class, args);

		// APi Connector
		ApiConnector apc = new ApiConnector(Config.API_KEY.toString());

		// Services
		AccountService as = new AccountService(apc);
		CharacterService cs = new CharacterService(apc);
		ColorService cos = new ColorService(apc);

		// Objects
		Account account = new Account();
		Character[] characters = new Character[0];
		Color[] colors;


		// Run

		logger.info("Getting Account info.");
		try {
			account = as.getAccount();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		logger.info("Getting Characters Info. This may take a while.");
		try {
			characters = cs.getCharacters();
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.info(characters[0].getGender());

		logger.info("Getting Color info");
		try{
			colors = cos.getColors();
		}catch (IOException e){
			e.printStackTrace();
		}


	}
}
