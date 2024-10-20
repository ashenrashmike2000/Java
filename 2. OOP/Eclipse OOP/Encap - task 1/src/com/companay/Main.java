package com.companay;

public class Main {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.setAge(5);
		
		System.out.println(emp1.getAge());
	}

}

class Employee{
	private int age;
	
	public void setAge(int age) {
		if(age<18) {
			System.out.println("Age should be greater than 18");
		}else if(age>40){
			System.out.println("Age should be less than 40 ");
		}else {
			this.age=age;
		}
	}
	public int getAge(){
		return this.age;
	}
}