package com.company;

public class Ball extends ThreeDobjects {
	static int numberofBalls;
	
	public Ball(double radius) {
		this.radius= radius;
		numberofBalls = numberofBalls + 1;
		this.id = numberofBalls;
		
	}
		
	public void printVolume() {
		double volume;
		volume=(3*radius*radius*radius)*4/3;
		System.out.println(volume);
	}

}
