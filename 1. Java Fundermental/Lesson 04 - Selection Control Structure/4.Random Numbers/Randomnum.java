import java.util.*;
class Randomnum{
	public static void main(String args[]){
		Random input = new Random();
		int num1 = input.nextInt(100);
		System.out.print("Number 1 is ");
		System.out.println(num1);
		Scanner input2 = new Scanner(System.in);
		System.out.print("Number 2 is ");
		int num2 = input2.nextInt();
		System.out.print("Number 3 is ");
		int num3 = input2.nextInt();
		int max_num = 0;
		if (num1>num2){
			if(num1>num3){
				max_num = num1;
			}else{
				max_num = num2;
				}
		}else{
			if(num2>num3){
			max_num = num2;
			}
		else{
			max_num = num3;
			}
		}
	System.out.print("Maximum Number is ");		
	System.out.print(max_num);		
	}
}
