package com.iamgroot.java.architecture.creation.factory.example;

public class HTMLButton implements Button{
    @Override
    public void clickButton() {
        System.out.println("HTML Button Clicked");
    }
}
