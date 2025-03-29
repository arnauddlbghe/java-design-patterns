package com.delberghea.behavioral.observer.solution;

import com.delberghea.behavioral.observer.solution.model.Customer;
import com.delberghea.behavioral.observer.solution.model.Store;

public class ObserverDemo {
    public static void main(String[] args) {
        Store store = new Store(5);
        Customer customer = new Customer();
        Customer customer1 = new Customer();

        store.getStorePublisher().addCustomer(customer);

        store.setProductQuantity(5);

        // Here, right when the store is updating his product, customers who are subscribed are notified.
    }
}