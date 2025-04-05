package com.delberghea.creational.factorymethod.model;

public class Voiture implements Vehicule {
    @Override
    public void rouler() {
        System.out.println("Voiture rouler");
    }
}
