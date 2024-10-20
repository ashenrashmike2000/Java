package com.company;

public class Box{
	double length;
	double height;
	double width;
	
	public Box(double length, double height, double width) {
		this.length = length;
		this.height=height;
		this.width=width;
	}
	
	public Box(double length, double height) {
		this.length = length;
		this.height=height;
		this.width=10;
	}
	
	public Box(double length) {
		this.length = length;
		this.height=20;
		this.width=10;
	}
	
	public void printVolume(){
		double volume;
		volume = length*height*width;
		System.out.println(volume);
	}
	
	public void setValues(double length, double height, double width) {
		this.length = length;
		this.height=height;
		this.width=width;
	}
}