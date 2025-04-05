package com.delberghea.creational.factorymethod.with.factory;

import com.delberghea.creational.factorymethod.model.Camion;
import com.delberghea.creational.factorymethod.model.Moto;
import com.delberghea.creational.factorymethod.model.Vehicule;
import com.delberghea.creational.factorymethod.model.Voiture;

public class VehiculeFactory {

    /**
     *
     * @param type
     * @return
     */
    public static Vehicule createVehicule(String type) {
        return switch (type.toLowerCase()) {
            case "camion" -> new Camion();
            case "moto" -> new Moto();
            default -> new Voiture();
        };
    }

}
