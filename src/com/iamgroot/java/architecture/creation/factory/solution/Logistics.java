package com.iamgroot.java.architecture.creation.factory.solution;

/**
 * CREATOR CLASS
 * This is the creator interface which is
 */
public abstract class Logistics {
    public abstract Transport createTransport();

    /**
     * Note, despite its name, product creation is not the primary responsibility of the creator.
     * Usually, the creator class already has some core business logic related to products.
     * The factory method helps to decouple this logic from the concrete product classes
     */
    public void planDelivery(){
        Transport t = createTransport();
        t.deliver();
    }
}
