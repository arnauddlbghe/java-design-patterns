package com.delberghea.creational.factorymethod.with;

import com.delberghea.creational.factorymethod.with.factory.VehiculeFactory;
import com.delberghea.creational.factorymethod.model.Vehicule;

public class Main {
    public static void main(String[] args) {
        Vehicule camion = VehiculeFactory.createVehicule("camion");
        Vehicule moto = VehiculeFactory.createVehicule("moto");
        Vehicule voiture = VehiculeFactory.createVehicule("voiture");

        camion.rouler();
        moto.rouler();
        voiture.rouler();
    }
}