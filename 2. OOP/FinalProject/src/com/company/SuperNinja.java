package com.company;

public class SuperNinja extends Ninja{
    public SuperNinja(String name,int health){
        super(name,health);
    }

    @Override
    public void attack(Devil devil) {
        devil.loseHealth(2);
    }

    public void increaseHealth(){
        if(this.getHealth()==5){
            System.out.println(this.getName()+" cannot increase health beyond "+this.getHealth());
        }else if(this.getHealth()<=0){
            System.out.println(this.getName()+" cannot increase health as you are dead. ");
        }
        else {
            this.setHealth(this.getHealth() + 1);
            System.out.println(this.getName() + " : health increased to  " + this.getHealth());
        }
    }
}
