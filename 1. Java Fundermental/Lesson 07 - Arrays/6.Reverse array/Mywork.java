import java.util.*;
class Mywork{
//Reverse Array
//[1,2,3,4] ---> [4,3,2,1]
	public static void main(String args[]){
	int[] arr= new int [] {1,2,3,4,5,6,7,8,9,10};
	
	
	//reverse(arr);
	System.out.println(Arrays.toString(reverse(arr)));
	
}
	public static int[] reverse(int[] arr){
		int[] reversearr = new int[arr.length];
		for(int i=(arr.length -1);i>=0;i--){
			reversearr[(arr.length)-(i+1)]= arr[i];
		}
		
		return (reversearr);
	
	
	}
	
	/*public static void reverse(int[] arr){
		int temp;
		int len = arr.length;
		for(int i=0;i<(len/2);i++){
			temp=arr[i];
			arr[i]=arr[len-i-1];
			arr[len-i-1]=temp;
		}
	System.out.println(Arrays.toString(arr));
	
	}*/
	

}
