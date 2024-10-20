import java.util.*;
class Mywork{
	//copy array
	public static void main(String args[]){
	int[]arr1 = {1,2,3,4,5,6};
	int[]arr2 = new int[4];
	int[]arr3 = new int[8];
	int[]arr4 = new int[6];
	
	copyFromTo(arr1,arr2); //arr2 [0,0,0,0] --> [1,2,3,4]
	copyFromTo(arr1,arr3); //arr3 [0,0,0,0,0,0,0,0] --> [1,2,3,4,5,6,0,0]
	copyFromTo(arr1,arr4); //arr4 [0,0,0,0,0,0] --> [1,2,3,4,5,6]
	}
	public static void copyFromTo(int[] arr1,int [] arr2) {
		for(int i=0;i<(arr2.length<arr1.length ? arr2.length:arr1.length);i++){
				arr2[i]=arr1[i];		
			}
			System.out.println(Arrays.toString(arr2));
	}
}
