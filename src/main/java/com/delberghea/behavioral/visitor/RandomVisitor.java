package com.delberghea.behavioral.visitor;

import com.delberghea.behavioral.visitor.model.Circle;
import com.delberghea.behavioral.visitor.model.Rectangle;

public class RandomVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Here i can do smth else with circle; " + circle);
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("But nothing with rectangle.");
    }
}
