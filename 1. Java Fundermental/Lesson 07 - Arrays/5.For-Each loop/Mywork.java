import java.util.*;
class Mywork {
	//For - each loop
	public static void main(String args[]){
		int[] arr = new int[10];
		int len = arr.length;
		for(int i=0;i<len;i++){
			arr[i]=i;
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Loop Start");
		for(int i:arr){
			System.out.println(i);
				
		}
		System.out.println("Loop End");
	}
}
