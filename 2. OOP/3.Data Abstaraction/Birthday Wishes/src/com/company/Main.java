package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ibirhtday> birthdayList = new ArrayList();
        Ibirhtday.wish();
    }
}

interface Ibirhtday{
    void wish();
}

class Manager implements Ibirhtday{

    @Override
    public void wish() {
        System.out.println("HBD Manager");
    }
}

class Officer implements Ibirhtday{

    @Override
    public void wish() {
        System.out.println("HBD Officer");
    }
}

class Worker {

}