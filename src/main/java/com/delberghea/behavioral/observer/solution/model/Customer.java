package com.delberghea.behavioral.observer.solution.model;

import java.util.UUID;

public class Customer implements Subscriber {

    private final UUID uuid;

    public Customer() {
        this.uuid = UUID.randomUUID();
    }

    @Override
    public void updateOnEvent(Store store) {
        System.out.println("Customer " + this.uuid + " received event from store " + store.getUuid());
    }
}
