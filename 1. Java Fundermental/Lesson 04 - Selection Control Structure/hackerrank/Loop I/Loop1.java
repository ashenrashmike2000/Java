import java.util.*;

class Loop1{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    int i = 1;
    while(i<=10){
      System.out.println(N+" x "+ i +" = "+(N*(i++)));
            
    }
	}
}
