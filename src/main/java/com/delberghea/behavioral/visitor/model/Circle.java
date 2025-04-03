package com.delberghea.behavioral.visitor.model;

import com.delberghea.behavioral.visitor.Visitor;
import com.delberghea.behavioral.visitor.VisitorElement;

public class Circle implements VisitorElement {
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
