package com.company;

public class Static2{
	public static void main(String[] args){
	
	}
}

class Car{
	int id;
	static int numberofCars = 0;
	
	public Car(){
	 numberofCars = numberofCars + 1;
	 this.id = numberofCars;
	}
}
