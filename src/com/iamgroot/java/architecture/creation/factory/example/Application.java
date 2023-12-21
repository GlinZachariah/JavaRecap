package com.iamgroot.java.architecture.creation.factory.example;

public abstract class Application {

    protected abstract Button getButton();

    public void performClick(){
        Button button = getButton();
        button.clickButton();
    }
}
