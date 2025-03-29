package com.delberghea.behavioral.observer.problems.model;

import java.util.UUID;

public class Customer {

    private final UUID uuid;

    public Customer() {
        this.uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }

    /**
     * Used for LotOfCallFromUserDemo.Java.
     * @param store
     * @return
     */
    public boolean canBuyProductFromStore(Store store) {
        return store.getProductQuantity() > 0;
    }
}
