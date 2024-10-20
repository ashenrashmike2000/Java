package com.company;

public class Car {
	int id;
	static int numberofCars=0;
	
	public Car(){
		numberofCars = numberofCars +1;
		this.id = numberofCars;
	}
	
	public static void staticMethod() {
		System.out.println("Staic Method");
	}
	
	public void normalMethod() {
		System.out.println("Normal Method");
	}

}
