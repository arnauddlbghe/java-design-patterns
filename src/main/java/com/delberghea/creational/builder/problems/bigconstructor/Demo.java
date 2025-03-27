package com.delberghea.creational.builder.problems.bigconstructor;

import com.delberghea.creational.builder.problems.bigconstructor.model.House;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Starting demo of Builder case problem using Big Constructor");

        // 1. It works but... Depending on the class I can't get to know with which House i'm currently working on.
        House house = new House(10, 10, 10, false, false, false, false);

        // 2. Without reading parameters, we can't get to know my object. And if they have a different behaviour depending on their attributes, it makes it hard to read and maintain.
        House house2 = new House(10, 10, 10, false, false, true, false);

        // 3. And adding a new attributes will require to update all other constructor to make our code compiles.
        System.out.println(house);
        System.out.println(house2);
    }
}
