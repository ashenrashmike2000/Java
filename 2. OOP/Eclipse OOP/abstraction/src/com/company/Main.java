package com.company;

public class Main {

    public static void main(String[] args) {
//            Man m = new Man();
            SuperMan s = new SuperMan();
            Man m1 = new SuperMan();
            m1.eat();
            s.fly();
    }
}

abstract class Man{
    public void eat(){
            System.out.println("Eat...");
    }

    public abstract void fly();
}

class SuperMan extends Man{

    @Override
    public void fly() {
            System.out.println("Fly");
    }
}
