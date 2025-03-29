package com.delberghea.structural.adapter.solution.model;

public class SquarePegAdapter extends RoundPeg {

    // Build a version of the SquarePeg, that will be seen as a RoundPeg.
    public SquarePegAdapter(SquarePeg squarePeg) {
        super((int) (squarePeg.getWidth() * Math.sqrt(2) / 2));
    }

}
