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

        // We will use a visitor that will take our object and implement the logic by himself on that object.
        Visitor visitor = new CalculPerimeterVisitor();
        circle.accept(visitor);
        rectangle.accept(visitor);

        // If we need another logic now, using those object, we can implement another visitor.
        // We will still use the circle.accept(visitor) to run our new logic using our object.
        Visitor visitor2 = new RandomVisitor();
        circle.accept(visitor2);
        rectangle.accept(visitor2);
    }
}