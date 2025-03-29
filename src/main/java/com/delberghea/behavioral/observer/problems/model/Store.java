package com.delberghea.behavioral.observer.problems.model;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Store {

    private final UUID storeId;
    private int productQuantity;
    private final Set<Customer> customers;

    public Store(int productQuantity) {
        this.storeId = UUID.randomUUID();
        this.productQuantity = productQuantity;
        this.customers = new HashSet<>();
    }

    public UUID getStoreId() {
        return storeId;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void notifyCustomers() {
        for (Customer customer : customers) {
            System.out.println("Hey " + customer.getUuid() + " we, Store + " + storeId + " have product for you");
        }
    }

}
