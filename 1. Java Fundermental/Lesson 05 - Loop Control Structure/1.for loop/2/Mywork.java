import java.util.*;
class Mywork{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the Number: ");
	int num = input.nextInt();
	for (int i=num;(i<100);i+=num){
		System.out.println(i);
		}
	}
}
