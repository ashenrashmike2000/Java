package com.company;
public class Main {
    public static void main(String[] args) {
        Deer d1 = new Deer(); //legal
        Monkey m1 = new Monkey(); //legal
        Parrot p1 = new Parrot(); //legal

        p1.eat();
        p1.fly();
        m1.climb();
        m1.eat();

        //Deer d2 = new Parrot(); //illegal

        Animal a1 = new Animal(); //legal

        a1.eat();
        //a1.fly(); //illegal

        Animal a2 = new Deer(); //legal
        Animal a3 = new Monkey(); //legal
        Animal a4 = new Parrot(); //legal

        d1.run();
        //a2.run(); //illegal
        //a3.climb(); //illegal
        //a4.fly(); //illegal

        //Deer deer = new Animal();
        //Parrot parrot = new Animal();
        //Monkey monkey = new Animal();

        Deer deer1 = (Deer) animal1; //downcasting

        Animal animal2 = new Parrot();

        Animal animal1 = new Deer(); //upcasting
        animal1.eat();
        Deer deer1 = (Deer) animal1; //downcasting
        deer1.run();
    }
}