package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles=new ArrayList<>();
        Car car1=new Car("TOYOTA");
        Car car2=new Car("NISSAN");

        System.out.println(car1.tokenNumber);
        System.out.println(Car.numberOfCars);

        Worker worker = new Worker();
        Van van = new Van();
        Bus bus = new Bus();

        worker.paintVehicle(car1);
        worker.paintVehicle(van);
        worker.paintVehicle(bus);

        vehicles.add(car1);
        vehicles.add(van);
        vehicles.add(bus);

    }
}
