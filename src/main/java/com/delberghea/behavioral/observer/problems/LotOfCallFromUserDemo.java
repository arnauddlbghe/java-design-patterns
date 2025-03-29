package com.delberghea.behavioral.observer.problems;

import com.delberghea.behavioral.observer.problems.model.Customer;
import com.delberghea.behavioral.observer.problems.model.Store;

public class LotOfCallFromUserDemo {

    public static void main(String[] args) {
        // One of problem that can required usage of an observer is the calls from user frequently to check if an event occured.
        Customer customer = new Customer();
        Store store = new Store(0);

        // Our store is empty.
        // But our customer doesn't know it yet. He has to check if there is a quantity or not.
        boolean result = customer.canBuyProductFromStore(store);
        System.out.println("Does my customer can buy something from store (id=" + store.getStoreId() + " ? " + result);


        // But what if our store changes his later ?
        store.setProductQuantity(100);


        // Our customer isn't warned about it.
        // He has to recheck it to get to know if there is now a quantity.
        boolean result2 = customer.canBuyProductFromStore(store);
        System.out.println("Does my customer can buy something from store (id=" + store.getStoreId() + " ? " + result2);

        // And so on... with productQuantity moving to 0 and from 0... It can lead to frequently fetch operations.
        // The more there is and the fastest the user will be able to buy.
        // Leading to a lot of resource and network usage and consumption.
    }

}