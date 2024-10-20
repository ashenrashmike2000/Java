import java.util.*;
class Mywork{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		if ((num%2)== 0){
			System.out.println("Even Number.");
		}
		else{
			System.out.println("Odd Number.");
		}
	}
}

