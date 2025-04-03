package com.delberghea.behavioral.visitor;


import com.delberghea.behavioral.visitor.model.Circle;
import com.delberghea.behavioral.visitor.model.Rectangle;

public class CalculPerimeterVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        double perimetre = 2 * Math.PI * circle.getRayon();
        System.out.println("Perimetre du cercle : " + perimetre);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double perimetre = 2 * (rectangle.getLargeur() + rectangle.getLongueur());
        System.out.println("Perimetre du rectangle : " + perimetre);
    }
}
