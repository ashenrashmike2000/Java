package com.company;

public class Main{
	public static void main(String args[]) { 
		Box box1 = new Box(10, 15, 30);
		//System.out.println(box1.width);
		//box1.setValues(20, 30, 10);
		//box1.printVolume();
		
		Box box2 = new Box(10,20);
		System.out.println(box1.width);
		System.out.println(box2.width);
		
		Box box3 = new Box(10);
		System.out.println(box3.width);
	}
	
	

}

