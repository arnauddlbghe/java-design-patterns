package com.delberghea.behavioral.visitor.model;

public class Rectangle {
    private double largeur;
    private double longueur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.longueur = hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public double getSurfaceArea() {
        return largeur * longueur;
    }

}