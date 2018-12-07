package com.guildwars2api.config;

public enum Config {
    API_KEY("31DC7F2E-E15D-9E45-945F-6A331025FF73BB796CA2-A215-45DD-B554-3ED1FD31CF84");

    private final String text;
    Config(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
