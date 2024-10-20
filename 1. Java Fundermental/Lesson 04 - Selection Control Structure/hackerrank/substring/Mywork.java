import java.util.*;
class Mywork{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the Sentence: ");
	String str = input.nextLine();
	String[] arrOfStr = str.split(" ");
	for (String a : arrOfStr)
            System.out.print(a);
	}
}
