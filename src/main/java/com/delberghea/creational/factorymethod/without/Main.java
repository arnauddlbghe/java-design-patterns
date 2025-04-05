package com.delberghea.creational.factorymethod.without;

import com.delberghea.creational.factorymethod.model.Camion;
import com.delberghea.creational.factorymethod.model.Moto;
import com.delberghea.creational.factorymethod.model.Vehicule;
import com.delberghea.creational.factorymethod.model.Voiture;

public class Main {
    public static void main(String[] args) {
        Vehicule camion = new Camion();
        Vehicule moto = new Moto();
        Vehicule voiture = new Voiture();

        camion.rouler();
        moto.rouler();
        voiture.rouler();
    }
}