package com.delberghea.structural.flyweight.with;


import com.delberghea.structural.flyweight.with.model.Tree;
import com.delberghea.structural.flyweight.with.model.TreeType;

import java.util.ArrayList;
import java.util.List;

public class WithFlyweightApplication {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Mesure de l'implémentation de 1 000 000 Arbre dans notre code.");

        Runtime runtime = Runtime.getRuntime();
        // On appelle le garbage collector pour libérer le plus possible de mémoire.
        runtime.gc();
        Thread.sleep(100);

        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        TreeType treeType = new TreeType("name", "color", "texture");
        List<Tree> trees = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            trees.add(new Tree(treeType, i, i));
        }

        // On libere la mémoire, en cas de process secondaire declenches.
        // runtime.gc();

        // Ici, la difference de memoire utilisee devrait etre celle representant nos 100 000 arbres.
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Mémoire utilisée : " + (memoryAfter - memoryBefore) / 1024 + " Ko");
    }


}
