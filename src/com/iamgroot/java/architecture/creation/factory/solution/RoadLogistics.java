package com.iamgroot.java.architecture.creation.factory.solution;

public class RoadLogistics extends Logistics {


    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
