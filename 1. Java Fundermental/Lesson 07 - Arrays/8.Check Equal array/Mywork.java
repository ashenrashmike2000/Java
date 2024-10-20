import java.util.*;
class Mywork{
	//chack equal array
	public static void main(String args[]){
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {1,2,3,4,5,6};
		int[] arr3 = {1,2,3,4};
		int[] arr4 = {1,2,3,4,4,6};
		
		System.out.println(EqualArr(arr1,arr2));//True
		System.out.println(EqualArr(arr1,arr3));//False
		System.out.println(EqualArr(arr1,arr4));//False
	}
	
	public static boolean EqualArr(int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length){
			return false;
		}
		else{
			for(int i=0; i<arr1.length;i++){
				if(arr1[i] != arr2[i]){
					return false;
				}
			}
			return true;
		}
	
	}
}
