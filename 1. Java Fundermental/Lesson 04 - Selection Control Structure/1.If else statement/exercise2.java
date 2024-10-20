import java.util.*;
class exercise2{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Marks : ");
		int marks = input.nextInt(); // Integer 
		if (marks==10 || marks==15){
			System.out.println("Won");
		}else{
			System.out.println("Lost");
		}
	}
}