///package com.company;
public class Main{

    public static void main(String[] args){

        Employee emp1 = new Employee();
        emp1.name = "Kasun";
        emp1.salary =40000;
        emp1.companyName="Company 1";

        Employee emp2 = new Employee();
        emp2.name ="Nuwan";
        emp2.salary = 60000;
        emp2.companyName="Company 1";

        emp1.companyName="Company 2";
        emp2.companyName="Company 2";

        emp1.companyName ="Company 2";

        System.out.println(emp1.companyName);
        System.out.println(emp2.companyName);
    }
}

class Employee{
    String name;
    double salary;
    String companyName;
}