import java.util.*;
class exercise{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Marks : ");
		int marks = input.nextInt(); // Integer 
		if (marks>50){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
	}
}