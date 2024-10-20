import java.util.*;
class Mywork{
	
		public static void main(String args[]){
		Integer [] myArray = {1,2,3,4,5,6,7,8,9,10}; 
        System.out.println("Original Array:" + Arrays.asList(myArray));
        Collections.reverse(Arrays.asList(myArray)); 
        System.out.println("Reversed Array:" + Arrays.asList(myArray));
	} 
	
		/*public static void main(String args[]){
			int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10,11};
			reverse(arr);
			System.out.println(Arrays.toString(arr));
			}
		public static int[] reverse(int arr[]){
			int temp;
			int len=arr.length;
			for(int i=0;i<(len/2);i++){
				temp=arr[i];
				arr[i]=arr[len-i-1];
				arr[len-i-1]=temp;
			}
			
			return (arr);
		}*/
	}
