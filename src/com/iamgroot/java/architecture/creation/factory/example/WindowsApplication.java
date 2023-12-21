package com.iamgroot.java.architecture.creation.factory.example;

public class WindowsApplication extends Application{
    @Override
    public Button getButton() {
        return new WindowsButton();
    }
}
