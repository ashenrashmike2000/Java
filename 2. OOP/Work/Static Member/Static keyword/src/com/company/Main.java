package com.company;
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name="Kasun";
        emp1.salary=40000;
        Employee.companyName="Company 1";

        Employee emp2 = new Employee();
        emp2.name="Nuwan";
        emp2.salary=60000;
        Employee.companyName="Company 1";

        System.out.println(Employee.companyName);
        System.out.println(Employee.companyName);

        Employee.companyName="Company 2";
        Employee.companyName="Company 3";

        System.out.println(Employee.companyName);
        System.out.println(Employee.companyName);
    }
}

class Employee{
    String name;
    double salary;
    static String companyName;


}