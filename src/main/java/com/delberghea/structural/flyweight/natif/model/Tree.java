package com.delberghea.structural.flyweight.natif.model;

public class Tree {

    String name, color, texture;
    int latitude, longitude;

    public Tree(String name, String color, String texture, int latitude, int longitude) {
        this.name = name;
        this.color = color;
        this.texture = texture;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
