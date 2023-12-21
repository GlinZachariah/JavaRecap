package com.iamgroot.java.architecture.creation.factory.solution;

/**
 * CONCRETE PRODUCT
 * This is a specific implementation of the product
 */
public class Truck implements Transport{
    @Override
    public void deliver(){
        System.out.println("Deliver truck");
    }
}
