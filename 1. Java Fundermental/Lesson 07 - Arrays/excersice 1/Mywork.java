import java.util.*;
public class Mywork{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number of inputs: ");
	int len = input.nextInt();
	int[] arr = new int[len];
	int i=0;
	while(i<len){
	System.out.println("Enter Input"+(i+1)+" : ");
	arr[i] = input.nextInt();
	i++;
	}
	
	System.out.println(Arrays.toString(arr));
	}
}
