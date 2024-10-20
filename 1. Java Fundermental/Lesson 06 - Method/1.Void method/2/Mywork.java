import java.util.*;
class Mywork{
	public static void main(String arg[]){
		System.out.println("main method");
		addition();
	}
	
	public static void addition(){
		Scanner input = new Scanner(System.in);
		int number1;
		System.out.print("Enter number2: ");
		int number2=input.nextInt();
		System.out.print("Enter number3: ");
		int number3=input.nextInt();
		number1 = number2 + number3;
		System.out.println(number1);
	}
}
