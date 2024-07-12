package com.example.europe_map_app.model;

public class Country {
    private String name;
    private String flagUrl;
    private String translation;
    private int x;
    private int y;

    public Country(String name, String flagUrl, String translation, int x, int y) {
        this.name = name;
        this.flagUrl = flagUrl;
        this.translation = translation;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Getters for other properties (name, flagUrl, translation)
}
