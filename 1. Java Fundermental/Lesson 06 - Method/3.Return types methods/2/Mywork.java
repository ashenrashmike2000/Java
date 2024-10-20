import java.util.*;
class Mywork{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Main method");
		System.out.print("Enter marks: ");
		int marks = input.nextInt();
		String grade = grade(marks);
		System.out.println(grade);
		
	}
	public static String grade(int marks){
		if (marks>=75){
			return "Best";
			}
		else if(marks>=65){
			return "Better";
			}
		else if(marks>=50){
			return "Good";
			}
		else{
			return "Not good";
			}
	}
}
