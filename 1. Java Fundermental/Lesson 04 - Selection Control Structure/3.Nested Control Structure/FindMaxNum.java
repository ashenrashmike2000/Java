import java.util.*;
class FindMaxNum{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Number 1 is ");
		int num1 = input.nextInt();
		System.out.print("Number 2 is ");
		int num2 = input.nextInt();
		System.out.print("Number 3 is ");
		int num3 = input.nextInt();
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
