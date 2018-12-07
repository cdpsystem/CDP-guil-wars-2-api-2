package com.guildwars2api.config;

public enum APIOptions {
    // Base URL
    HTTP_BASE_URL("https://api.guildwars2.com/"),

    // Version
    API_VERSION1("v1/"),
    API_VERSION2("v2/"),

    // Account
    ACCOUNT("account"),
    ACCOUNT_ACHIEVEMENTS("account/achievements"),
    ACCOUNT_BANK("account/bank"),
    ACCOUNT_DUNGEONS("account/dungeons"),
    ACCOUNT_DYES("account/dyes"),
    ACCOUNT_FINISHERS("account/finishers"),
    ACCOUNT_GLIDERS("account/gliders"),
    ACCOUNT_HOME_CATS("account/home/cats"),
    ACCOUNT_HOME_NODES("account/home/nodes"),
    ACCOUNT_INVENTORY("account/inventory"),
    ACCOUNT_MAILCARRIERS("account/mailcarriers"),
    ACCOUNT_MASTERIES("account/masteries"),
    ACCOUNT_MASTERY_POINTS("account/mastery/points"),
    ACCOUNT_MATERIALS("account/materials"),
    ACCOUNT_MINIS("account/minis"),
    ACCOUNT_MOUNTS_SKINS("account/mounts/skins"),
    ACCOUNT_MOUNTS_TYPES("account/mounts/types"),
    ACCOUNT_OUTFITS("account/outfits"),
    ACCOUNT_PVP_HEROES("account/pvp/heroes"),
    ACCOUNT_RAIDS("account/raids"),
    ACCOUNT_RECIPES("account/recipes"),
    ACCOUNT_SKINS("account/skins"),
    ACCOUNT_TITLES("account/titles"),
    ACCOUNT_WALLET("account/wallet"),

    // Achievements
    ACHIEVEMENTS("achievements"),
    ACHIEVEMENTS_CATEGORIES("achievements/categories"),
    ACHIEVEMENTS_DAILY("achievements/daily"),
    ACHIEVEMENTS_DAILY_TOMORROW("achievements/daily/tomorrow"),
    ACHIEVEMENTS_GROUPS("achievements/groups"),

    // Backstory
    BACKSTORY("backstory"),
    BACKSTORY_ANSWERS("backstory/answers"),
    BACKSTORY_QUESTIONS("backstory/questions"),

    // Backstory
    BUILD("build"),

    // Cats
    CATS("cats"),

    // Characters
    CHARACTERS("characters"),

    // Colors
    COLORS("colors"),

    // Commerce
    COMMERCE_DELIVERY(""),
    COMMERCE_EXCHANGE_COINS(""),
    COMMERCE_EXCHANGE_GEMS(""),
    COMMERCE_LISTINGS(""),
    COMMERCE_PRICES(""),
    COMMERCE_TRANSACTIONS(""),

    // Continents
    CONTINENTS(""),

    // Currencies
    CURRENCIES("currencies"),

    // Dungeons
    DUNGEONS("dungeons"),

    // Emblem
    EMBLEM("emblem"),

    // Files
    FILES("files"),

    // Finishers
    FINISHERS("finishers"),

    // Gliders
    GLIDERS("gliders"),

    // Guild
    GUILD("guild"),
    GUILD_ID_LOG("/log"),
    GUILD_ID_MEMBERS("/members"),
    GUILD_ID_RANKS("/ranks"),
    GUILD_ID_STASH("/stash"),
    GUILD_ID_STORAGE("/storage"),
    GUILD_ID_TEAMS("/teams"),
    GUILD_ID_TREASURY("/treasury"),
    GUILD_ID_UPGRADES("/upgrades"),
    GUILD_PERMISIONS("guild/permisions"),
    GUILD_SEARCH("guild/search"),
    GUILD_UPGRADES("guild/upgrades"),

    // Items
    ITEMS("item"),

    // ItemStats
    ITEMSTATS("itemstats"),

    // Legends
    LEGENDS("legends"),

    // Mailcarriers
    MAILCARRIERS("mailcarriers"),

    // Maps
    MAPS("maps"),

    // Masteries
    MASTERIES("masteries"),

    // Materials
    MATERIALS("materials"),

    // Minis
    MINIS("minis"),

    // Mounts
    MOUNTS_SKINS("mounts/skins"),
    MOUNTS_TYPES("mounts/types"),

    // Nodes
    NODES("nodes"),

    // Outfits
    OUTFITS("outfits"),

    // Pets
    PETS("pets"),

    // Professions
    PROFESSIONS("professions"),

    // PVP
    PVP_STATS("pvp/stats"),
    PVP_GAMES("pvp/games"),
    PVP_HEROES("pvp/heroes"),
    PVP_RANKS("pvp/ranks"),
    PVP_STANDINGS("pvp/standings"),
    PVP_SEASONS("pvp/seasongs"),
    PVP_SEASONS_LEADERBOARDS("pvp/seasongs/leaderboards"),

    // Quaggans - Quagan it's a pirate D:
    QUAGGANS("quaggans"),

    // Races
    RACES("races"),

    // Raids
    RAIDS("raids"),

    // Recipes
    RECIPES("recipes"),
    RECIPES_SEARCH("recipes/search"),

    // Skills
    SKILLS("skills"),

    // Specializations
    SPECIALIZATIONS("specializations"),

    // Stories
    STORIES("stories"),
    STORIES_SEASONS("stories/seasons"),

    // Titles
    TITLES("titles"),

    // Tokeninfo
    TOKENINFO("tokeninfo"),

        // Traits
    TRAITS("traits"),

    // Worlds
    WORLDS("worlds"),

    // WVW
    WVW("wvw"),
    WVW_ABILITIES("wvw/abilities"),
    WVW_MATCHES("wvw/matches"),
    WVW_MATCHES_STATS_TEAMS("wvw/matches/stats/teams"),
    WVW_OBJETIVES("wvw/objetives"),
    WVW_RANKS("wvw/ranks"),
    WVW_UPGRADES("wvw/upgrades"),
    ;

    private final String text;
    APIOptions(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
