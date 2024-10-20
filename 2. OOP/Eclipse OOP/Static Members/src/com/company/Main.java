package com.company;

public class Main {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.name = "Kasun";
		emp1.salary = 40000;
		emp1.companyName = "Company 1";
		
		Employee emp2 = new Employee();
		emp2.name = "Nuwan";
		emp2.salary = 60000;
		emp2.companyName = "Company 2";
		
		Employee emp3 = new Employee();
		emp3.name = "Nayana";
		emp3.salary=55000;
		Employee.companyName = "Company 3";
		
		//emp1.companyName = "Company 2";

		
		System.out.println(emp1.companyName);
		System.out.println(emp2.companyName);
		System.out.println(emp3.companyName);
		
	}

}

class Employee{
	String name;
	double salary;
	static String companyName;
}