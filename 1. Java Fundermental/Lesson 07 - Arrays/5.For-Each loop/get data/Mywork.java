import java.util.*;
class Mywork {
	//For - each loop
	public static void main(String args[]){
		int[] arr = new int[10];
		int len = arr.length;
		int num=0;
		for(int i:arr){
			arr[num]=num;
			num++;
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Loop Start");
		for(int i:arr){
			System.out.println(i);
				
		}
		System.out.println("Loop End");
	}
}
