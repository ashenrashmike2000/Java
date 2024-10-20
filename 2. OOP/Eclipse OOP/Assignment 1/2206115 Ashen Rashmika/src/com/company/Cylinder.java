package com.company;

public class Cylinder extends ThreeDobjects {
	double height;
	static int numberofCylinders;
	
	public Cylinder(double radius,double height) {
		this.radius= radius;
		this.height=height;
		numberofCylinders = numberofCylinders + 1;
		this.id = numberofCylinders;
		
	}
		
	public void printVolume() {
		double volume;
		volume=3*radius*radius*height;
		System.out.println(volume);
	}
	

}
