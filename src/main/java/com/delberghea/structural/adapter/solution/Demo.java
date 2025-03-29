package com.delberghea.structural.adapter.solution;

import com.delberghea.structural.adapter.solution.model.RoundHole;
import com.delberghea.structural.adapter.solution.model.RoundPeg;
import com.delberghea.structural.adapter.solution.model.SquarePeg;
import com.delberghea.structural.adapter.solution.model.SquarePegAdapter;

public class Demo {
    public static void main(String[] args) {
        // Let's first check that our roundHole and our roundPeg fit perfectly.
        RoundHole roundHole = new RoundHole(10);
        RoundPeg roundPeg = new RoundPeg(10);
        System.out.println(roundHole.fits(roundPeg));

        // Will not compile. Can't check directly if squarePeg fit in roundHole.
        // SquarePeg squarePeg = new SquarePeg(5);
        // System.out.println(roundHole.fits(squarePeg));

        // But now, we can check if our square will fit in our roundHole.
        SquarePeg squarePeg = new SquarePeg(5);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        System.out.println(roundHole.fits(squarePegAdapter));
    }
}