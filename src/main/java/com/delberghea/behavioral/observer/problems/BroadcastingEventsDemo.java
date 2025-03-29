package com.delberghea.behavioral.observer.problems;

import com.delberghea.behavioral.observer.problems.model.Customer;
import com.delberghea.behavioral.observer.problems.model.Store;

public class BroadcastingEventsDemo {
    public static void main(String[] args) {
        // Another problem that can lead to the solution of the Observer pattern is the broadcasting message process.

        // If the user calling the store is a problem. May the solution be to ask for the store to notify the customer.
        // To get list of user, we will then save our customer that have interest for the store.
        Customer customer = new Customer();
        Store store = new Store(0);
        boolean result = customer.canBuyProductFromStore(store);

        store.getCustomers().add(customer);


        // Now, we can imagine our store to changes his quantity and notify all customer he memorized.
        store.setProductQuantity(100);
        store.notifyCustomers();

        // Problem ? All customers may not want to be notified. Maybe this wasn't the product they were waiting for.
        // But we can feel that we are going toward the solution. We removed the repetitive calls from customers to check the store quantity.
    }
}