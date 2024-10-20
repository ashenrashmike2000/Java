package com.company;
public class Main {
    public static void main(String[] args) {
            Employee employee1 = new Employee();

            employee1.setId(1);
            employee1.setSalary(40000);
            employee1.setAge(55);

            System.out.println(employee1.getAge());
    }
}

class Employee{
    private int id;
    private int salary;
    private int age;

    public void setId(int id){
        this.id=id;
    }

    public void setSalary(int salary){
        if(salary<0){
            System.out.println("Salary should be a positive value.");
        }else{
            this.salary=salary;
        }
    }

    public void setAge(int age){
        if(age<18){
            System.out.println("Age should be over 18");
        }else if(age>40){
            System.out.println("Age should be below the 40");
        }else{
            this.age=age;
        }
    }

    public int getID(){
        return this.id;
    }

    public int getSalary(){
        return this.salary;
    }

    public int getAge(){
        return this.age;
    }
}