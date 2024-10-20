import java.util.*;
public class Mywork{
	public static void main(String args[]){
	
	//1.Add data, 2.Get data, 3.Update data
	int[] arr = new int[6]; //[0,0,0,0,0]
	//1.ADD Data
	arr[0] = 5;
	arr[4] = 10;
	System.out.println(Arrays.toString(arr));
	
	//2.Get Data
	int number = arr[4];
	System.out.println(number);
	
	//3.Update Data
	arr[4] = 20;
	System.out.println(Arrays.toString(arr));
	}
}
