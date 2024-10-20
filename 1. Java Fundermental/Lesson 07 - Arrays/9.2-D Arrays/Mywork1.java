import java.util.*;
class Mywork1{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of row: ");
		int r = input.nextInt();
		System.out.println("Enter number of colomns: ");
		int c = input.nextInt();
		int[][] arr= new int[r][c];
		//arr[r][c]
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.println("Enter "+i + j+" data: ");
				arr[i][j] = input.nextInt();
			}
		}
		
		for(int[] ar: arr){
		System.out.println(Arrays.toString(ar));
		}
	}
}
