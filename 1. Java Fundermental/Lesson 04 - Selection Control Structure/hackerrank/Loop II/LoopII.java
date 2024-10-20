import java.util.*;

class LoopII{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter q: ");
	int q = input.nextInt();
	for(int i=0;(i<q);i++){
		System.out.print("Enter a: ");
		int a = input.nextInt();
		System.out.print("Enter b: ");
		int b = input.nextInt();
		System.out.print("Enter n: ");
		int n = input.nextInt();
		int logic = a;
		for(int m = 1 ;(m<=n);m++){
			double math = Math.pow(2,(m-1));
			int value = (int)math;
			double multi = value*b;
			int s = (int)multi;
			logic = s + logic ;
			System.out.print(logic+ " ");
			}
			System.out.print("\n");
		}
	}
}

