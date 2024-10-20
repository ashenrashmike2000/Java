package com.company;

public class Main{
	public static void main(String[] args) {
		GermanShep g = new GermanShep();
        g.bark();

        Dog d = new GermanShep();
        d.bark();

    }

}

class Dog{
    public void bark(){
        System.out.println("woof woof");
    }
}

class GermanShep extends Dog{
	@Override
	public void bark(){
		
        System.out.println("bow bow");
    }
}

class Lab extends Dog{
    public void bark(){
        System.out.println("sniff sniff");
    }
}
