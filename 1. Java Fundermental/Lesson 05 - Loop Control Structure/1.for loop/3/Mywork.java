import java.util.*;
class Mywork{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter start: ");
		int num1 = input.nextInt();
		System.out.print("Enter End: ");
		int num2 = input.nextInt();
	
		for(int i=num1;(i<=num2);i++){
			if(i%2==1){
			System.out.println(i);}
		}
	}
}
