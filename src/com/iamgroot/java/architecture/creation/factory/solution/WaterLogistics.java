package com.iamgroot.java.architecture.creation.factory.solution;

public class WaterLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
