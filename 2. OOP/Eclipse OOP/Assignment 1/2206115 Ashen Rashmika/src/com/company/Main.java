package com.company;

public class Main {
	public static void main(String[] args) {
		Cylinder cylinder1 = new Cylinder(7,14);
		cylinder1.printVolume();
		cylinder1.print();
		System.out.println(cylinder1.id);
		
		Cylinder cylinder2 = new Cylinder(7, 7);
		cylinder2.printVolume();
		cylinder2.print();
		System.out.println(cylinder2.id);
		
		Cylinder cylinder3 = new Cylinder(7,10);
		cylinder3.printVolume();
		cylinder3.print();
		System.out.println(cylinder3.id);
		
		System.out.println(Cylinder.numberofCylinders);
		
		Ball ball1 = new Ball(7);
		ball1.printVolume();
		ball1.print();
		System.out.println(ball1.id);
		
		Ball ball2 = new Ball(14);
		ball2.printVolume();
		ball2.print();
		System.out.println(ball2.id);
		
		Ball ball3 = new Ball(21);
		ball3.printVolume();
		ball3.print();
		System.out.println(ball3.id);
		
		System.out.println(Ball.numberofBalls);
	}

}
