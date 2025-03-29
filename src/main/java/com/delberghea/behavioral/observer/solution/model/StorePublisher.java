package com.delberghea.behavioral.observer.solution.model;

import java.util.HashSet;
import java.util.Set;

public class StorePublisher {

    private final Set<Subscriber> subscribers;

    public StorePublisher() {
        this.subscribers = new HashSet<>();
    }

    public boolean addCustomer(Subscriber customer) {
        return this.subscribers.add(customer);
    }

    public boolean removeCustomer(Subscriber customer) {
        return this.subscribers.remove(customer);
    }

    public void notifySubscribers(Store store) {
        for (Subscriber subscriber : subscribers) {
            subscriber.updateOnEvent(store);
        }
    }

}
