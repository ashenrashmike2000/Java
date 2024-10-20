package com.company;

public class Car  extends Vehicle{
    String name;
    String colour;
    int tokenNumber;
    double cost;
    static int numberOfCars=0;

    public Car(String name) {
        this.name = name;
        this.cost = cost;
        numberOfCars=numberOfCars+1;
        this.tokenNumber=numberOfCars;
    }

    @Override
    public void paint(){
        System.out.println("Paint Car...");
    }
}
