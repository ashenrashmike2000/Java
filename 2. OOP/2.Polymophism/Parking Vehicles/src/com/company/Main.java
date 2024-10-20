package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot();

        ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();

        Car car = new Car();
        Car car1 = new Car();
        Car car2 = new Car();
        Bus bus = new Bus();
        Van van = new Van();

        vehicleArrayList.add(car);
        vehicleArrayList.add(car1);
        vehicleArrayList.add(car2);
        vehicleArrayList.add(bus);
        vehicleArrayList.add(van);

        robot.autoPark(car);
        robot.autoPark(bus);
        robot.autoPark(van);
    }
}

class Robot{
    public void autoPark(Vehicle v1){
        v1.park();
    }
}

class Vehicle{
    public void park(){
        System.out.println("Parking");
    }
}

class Car extends Vehicle{
    @Override
    public void park(){
        System.out.println("Car Parking - 1st floor");
    }
}

class Van extends Vehicle{
    @Override
    public void park(){
        System.out.println("Van Parking - 2nd floor");
    }
}

class Bus extends Vehicle{
    @Override
    public void park(){
        System.out.println("Bus Parking - 3rd floor");
    }
}