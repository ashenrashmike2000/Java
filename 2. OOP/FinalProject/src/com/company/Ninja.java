package com.company;
public abstract class Ninja extends GameCharacter{
    private boolean armor;

    public Ninja(String name,int health){
        super(name,health);
        this.armor=true;
    }

    public void setArmor(boolean armor){
        this.armor=armor;
    }
    public boolean getArmor(){
        return armor;
    }

    public abstract void attack(Devil devil);

    public void loseHealth(){
        this.setHealth(this.getHealth()-1);
        if(this.getHealth()==0){
            System.out.println(this.getName()+" died");
        }else {
            System.out.println(this.getName() + " : health decreased to  " + this.getHealth());
        }
    }

    public void loseArmor(){
        this.armor=false;
        System.out.println(this.getName()+" lose Armor!");
    }

    public void gainArmor(){
        if(this.getHealth()<=0){
            System.out.println(this.getName()+" cannot gain armor you are dead");
        }else{
            if(this.getArmor()){
                System.out.println(this.getName()+" already has an armor");
            }else{
                this.setArmor(true);
                System.out.println(this.getName()+" armor gained!");
            }
        }


    }
}
