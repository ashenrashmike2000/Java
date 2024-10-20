package com.company;
public class Main {
    public static void main(String[] args) {
        Devil devil1 = new Devil("Devil1",5);
        Devil devil2 = new Devil("Devil2",5);
        SuperNinja superninja = new SuperNinja("SN1",5);
        NormalNinja normalninja = new NormalNinja("NN1",5);


        superninja.gainArmor();
        devil1.stealArmor(superninja);
        devil1.attack(superninja);
        devil1.attack(superninja);
        devil1.attack(superninja);
        devil1.attack(superninja);
        devil1.attack(superninja);
        devil1.attack(superninja);
        devil1.attack(superninja);
        superninja.gainArmor();
        superninja.increaseHealth();



        /*
        superninja.attack(devil1);
        normalninja.attack(devil2);

        superninja.attack(devil1);
        superninja.attack(devil1);
        superninja.attack(devil1);
        superninja.attack(devil1);
        superninja.attack(devil1);*/


        /*
        System.out.println(devil.getName());
        System.out.println(devil.getHealth());
        System.out.println(ninja.getName());
        System.out.println(ninja.getHealth());
        System.out.println(ninja.getArmor());*/
        /*
        devil1.attack(ninja1);
        devil1.attack(ninja2);
        devil1.attack(ninja1);
        devil1.attack(ninja1);
        devil1.attack(ninja1);
        devil1.attack(ninja1);
        devil1.stealArmor(ninja1);
        ninja1.attack(devil1);
        ninja1.attack(devil1);
        ninja1.attack(devil1);
        ninja1.attack(devil1);
        ninja1.attack(devil1);
        */
        /*
        devil1.attack(superNinja1);
        devil1.attack(superNinja1);
        devil1.attack(superNinja1);
        devil1.attack(superNinja1);


        superNinja1.increaseHealth();
        superNinja1.increaseHealth();
        superNinja1.increaseHealth();
        superNinja1.increaseHealth();
        superNinja1.increaseHealth();*/



    }
}