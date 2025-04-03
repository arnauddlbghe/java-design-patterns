package com.delberghea.behavioral.visitor;

import com.delberghea.behavioral.visitor.model.Circle;
import com.delberghea.behavioral.visitor.model.Rectangle;

public class Main {
    public static void main(String[] args) {
        // Création des éléments
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 5);

        // Perfect. I can have my surface:
        System.out.println(circle.getSurfaceArea());
        System.out.println(rectangle.getSurfaceArea());

        // But what if now I need the Perimeters? Without adding new logic to my DTO.
    }
}