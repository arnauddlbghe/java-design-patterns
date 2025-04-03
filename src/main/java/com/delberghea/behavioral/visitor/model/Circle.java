package com.delberghea.behavioral.visitor.model;

public class Circle {
    private double rayon;

    public Circle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public double getSurfaceArea() {
        // Let's make it false. We will want to implement
        return rayon * rayon * Math.PI;
    }

}
