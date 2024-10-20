import java.util.*;
class Mywork{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of Arrays: ");
		int a = input.nextInt();
		System.out.println("Enter number of row: ");
		int r = input.nextInt();
		System.out.println("Enter number of colomns: ");
		int c = input.nextInt();
		int[][][] arr= new int[a][r][c];
		//arr[r][c]
		for(int i=0;i<a;i++){
			for(int j=0;j<r;j++){
				for(int k=0;k<c;k++){
				System.out.println("Enter "+i+j+k+" data: ");
				arr[i][j][k] = input.nextInt();
				}
			}
		}
		
		for(int[][] arr1: arr){
			for(int[] arr2 : arr1){
				System.out.println(Arrays.toString(arr2));
			}
		}
	}
}
