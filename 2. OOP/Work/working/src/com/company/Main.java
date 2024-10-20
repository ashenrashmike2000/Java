package com.company;
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        //emp1.name="Sunil";
        //emp1.hourlyRate= 40;
        //emp1.workingHours= 100;

        emp1.setValues("Sunil",40,100);
        emp1.printSalary();
    }
}

class Employee{
    String name;
    double workingHours;
    double hourlyRate;

    public void printSalary(){
        double salary;
        salary=workingHours*hourlyRate;
        System.out.println(salary);
    }
    public void setValues(String name,double workingHours,double hourlyRate){
        this.name = name;
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }
}