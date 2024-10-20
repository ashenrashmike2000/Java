import java.util.*;
class Mywork{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number: ");
	int num = input.nextInt();
	String binary_number = "";
	while(num!=0){
		binary_number =(num%2) + binary_number;
		num /= 2;
		}
		System.out.println(binary_number);
	}
}
