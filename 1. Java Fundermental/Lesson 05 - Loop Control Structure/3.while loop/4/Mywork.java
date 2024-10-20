import java.util.*;
class Mywork{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Start: ");
	int num1 = input.nextInt();
	System.out.print("End: ");
	int num2 = input.nextInt();
	int i = num1;
	while((i)<= num2){
		if(i%2==1){
		System.out.println(i);}
		i++;
		}
	}
}
