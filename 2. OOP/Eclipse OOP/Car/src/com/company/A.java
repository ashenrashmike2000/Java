package com.company;
//a1.method2()
public class A {

	 static int x = 5;
	 int y = 10;

	 static void method1(){
	     System.out.println(x); //can
	    // System.out.println(y); //can't
	 }

	 void method2(){
	     System.out.println(x); //can
	     System.out.println(y); //can
	 }
}
