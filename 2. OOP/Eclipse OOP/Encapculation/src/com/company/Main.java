package com.company;

public class Main {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		//employee1.id =1;
		//employee1.salary = 30000;
		//employee1.age = 25;
		
		employee1.setID(1);
		employee1.setAge(23);
		employee1.setSalary(30000);
		
		System.out.println(employee1.getID());
		System.out.println(employee1.getSalary());
		System.out.println(employee1.getAge());
	}
}

class Employee{
	private int id;
	private int salary;
	private int age;
	
	public void setID(int id) {
		this.id =id;
	}
	
	public void setSalary(int salary) {
		if (salary<0) {
			System.out.println("Salary should be positive int");
		}else {
		this.salary =salary;
		}
	}
	
	public void setAge(int age) {
		this.age =age;
	}
	
	public int getID() {
		return this.id;
	}
	
	public int getAge() {
		return this.age;
	}
	public int getSalary() {
		return this.salary;
	}
	
}