package com.company;

public class Devil extends GameCharacter{
    public Devil(String name,int health){
        super(name,health);

    }

    public void attack(Ninja ninja){
        if(ninja.getArmor()){
            ninja.loseHealth(1);
        }else{
            ninja.loseHealth(2);
        }
    }

    public void stealArmor(Ninja ninja){
        ninja.loseArmor();
    }



}
