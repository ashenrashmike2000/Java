import java.util.*;
class Mywork{
	public static void main(String arg[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number2: ");
		int number2=input.nextInt();
		System.out.print("Enter number3: ");
		int number3=input.nextInt();
		System.out.println("main method");
		addition(number2,number3);
	}
	
	public static void addition(int num1, int num2){
		
		int number1;
		int number2=num1;
		int number3=num2;
		number1 = number2 + number3;
		System.out.println(number1);
	}
}
