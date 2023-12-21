package com.iamgroot.java.architecture.creation.factory.solution;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver ship");
    }
}
