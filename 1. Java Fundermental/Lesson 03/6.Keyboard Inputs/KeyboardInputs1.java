import java.util.*;
class KeyboardInputs1{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("What is your Name ? ");
		String name = input.next(); //nextLine or next
		System.out.print("How old are you ? ");
		int age = input.nextInt();
		System.out.print("Name "+ name + " Age " + age );
	}
}