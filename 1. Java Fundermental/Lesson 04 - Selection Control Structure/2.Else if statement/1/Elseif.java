import java.util.*;
class Elseif{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the marks ");
	int marks = input.nextInt();
	if (marks>=75){
		System.out.println("Best");
	}
	else if (marks>=60){
		System.out.println("Better");
	}
	else if (marks>=50){
		System.out.println("Good");
	}
	else {
		System.out.println("Not Good");
	}
		
	
	}
}
