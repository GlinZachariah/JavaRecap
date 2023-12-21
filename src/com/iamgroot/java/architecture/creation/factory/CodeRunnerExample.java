package com.iamgroot.java.architecture.creation.factory;

import com.iamgroot.java.architecture.creation.factory.example.Application;
import com.iamgroot.java.architecture.creation.factory.example.WindowsApplication;

public class CodeRunnerExample {

    public static void main(String[] args) {
        System.out.println("Example Code for Factory Pattern");

        Application application = new WindowsApplication();
        application.performClick();
    }
}
