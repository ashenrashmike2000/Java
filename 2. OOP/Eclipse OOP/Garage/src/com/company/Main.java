package com.company;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Vehicle> vehicles = new ArrayList<>();
        
        Worker worker = new Worker();
        Car car = new Car();
        Van van = new Van();
        Bus bus = new Bus();

        vehicles.add(car);
        vehicles.add(van);
        vehicles.add(bus);
        

        worker.paintVehicle(car);
        worker.paintVehicle(van);
        worker.paintVehicle(bus);
    }

}
