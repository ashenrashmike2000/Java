import java.util.*;
class Mywork{
	public static void main(String arg[]){
		System.out.println("main method");
		
		Scanner input = new Scanner(System.in);
		int number1;
		System.out.print("Enter number2: ");
		int number2=input.nextInt();
		System.out.print("Enter number3: ");
		int number3=input.nextInt();
		
		number1 = addition(number2,number3);
		System.out.println(number1);
	}
	
	public static int addition(int num1, int num2){
		
		int number1;
		int number2=num1;
		int number3=num2;
		number1 = number2 + number3;
		return number1;
	}
}
