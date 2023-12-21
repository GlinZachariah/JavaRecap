package com.iamgroot.java.architecture.creation.factory.example;

public class HTMLApplication extends Application{
    @Override
    public Button getButton() {
        return new HTMLButton();
    }
}
