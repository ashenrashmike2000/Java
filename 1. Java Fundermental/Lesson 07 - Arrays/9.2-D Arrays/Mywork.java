import java.util.*;
class Mywork{
	public static void main(String args[]){
		int[][] arr = {{1,2,3},{4,5,6}};
		int a,b,c,d;
		a = arr[0][0];
		b = arr[0][2];
		c = arr[1][0];
		d = arr[1][1];
		System.out.println(a+" "+b+" "+c+" "+d);
		System.out.println(Arrays.toString(arr[1]));
	}
}
