package com.company;

public class NormalNinja extends Ninja{
    public NormalNinja(String name,int health) {
        super(name, health);
    }

    @Override
    public void attack(Devil devil) {
        devil.loseHealth(1);
    }
}
