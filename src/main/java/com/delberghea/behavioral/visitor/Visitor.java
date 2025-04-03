package com.delberghea.behavioral.visitor;

import com.delberghea.behavioral.visitor.model.Circle;
import com.delberghea.behavioral.visitor.model.Rectangle;

public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}

