package com.delberghea.structural.flyweight.with.model;

public class Tree {

    TreeType treeType;
    int latitude, longitude;

    public Tree(TreeType treeType, int latitude, int longitude) {
        this.treeType = treeType;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
