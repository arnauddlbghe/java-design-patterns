package com.delberghea.behavioral.visitor.model;

import com.delberghea.behavioral.visitor.Visitor;
import com.delberghea.behavioral.visitor.VisitorElement;

public class Rectangle implements VisitorElement {
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}