import java.util.*;
class ArithmaticOper{
	public static void main(String args[]){
	int x = 10;
	int y = 2;
	
	System.out.println("Addition" + (x+y));
	System.out.println("Substraction" + (x-y));
	System.out.println("Multiplication" + (x*y));
	System.out.println("Division" + (x/y));
	System.out.println("Modules" + (x%y));
	System.out.println("prefix increment" + (++x));
	System.out.println("postfix increment" + (x++));
	System.out.println("x value is " + x);
	System.out.println("prefix decrement" + (--x));
	System.out.println("postfix decrement" + (x--));
	System.out.println("x value is " + x);
			double math = 0;
			math = Math.pow(x,y);
			int value = (int)math;
			int q = 3 +(value *2);
		
	System.out.println(q);
	}
}
