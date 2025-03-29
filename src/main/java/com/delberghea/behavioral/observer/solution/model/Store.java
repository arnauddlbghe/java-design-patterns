package com.delberghea.behavioral.observer.solution.model;

import java.util.UUID;

public class Store {

    private final UUID uuid;
    private int productQuantity;
    private final StorePublisher storePublisher;

    public Store(int productQuantity) {
        this.uuid = UUID.randomUUID();
        this.productQuantity = productQuantity;
        this.storePublisher = new StorePublisher();
    }

    public UUID getUuid() {
        return uuid;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
        System.out.println("Store " + this.getUuid() + " updated product quantity " + productQuantity);
        this.getStorePublisher().notifySubscribers(this);
    }

    public StorePublisher getStorePublisher() {
        return storePublisher;
    }
}
