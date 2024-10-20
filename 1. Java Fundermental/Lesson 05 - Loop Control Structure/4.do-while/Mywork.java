import java.util.*;

class Mywork{
	
	public static void main(String args[]){
		int i = 0;
		System.out.println("start do-while loop");
		do{
			System.out.println(i);
		}while ((i++)<= 10);
		System.out.println("end do-while loop");
		i = 0;
		System.out.println("start while loop");
		
		while((++i)<=10){
			
			System.out.println(i);
		}
		System.out.println("end while loop");
		
	}

	
}
