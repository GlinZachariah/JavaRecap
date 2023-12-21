package com.iamgroot.java.architecture.creation.factory;

import com.iamgroot.java.architecture.creation.factory.problem.Logistics;
import com.iamgroot.java.architecture.creation.factory.solution.RoadLogistics;

public class CodeRunner {

    public static void main(String[] args) {
        System.out.println("Executing Problem");
        Logistics problemLogistics = new Logistics();
        problemLogistics.handleTransport();

        System.out.println("Executing Solution");

        com.iamgroot.java.architecture.creation.factory.solution.Logistics logistics = new RoadLogistics();
        logistics.planDelivery();
    }
}
