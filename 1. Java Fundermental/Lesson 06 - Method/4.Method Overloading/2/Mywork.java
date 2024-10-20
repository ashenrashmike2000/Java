class Mywork{
	public static void main(String args[]){
		//part 2
		printMethod(10);
		printMethod(10,20);
		printMethod(10,20,30);
	}
	
	public static void printMethod(int num){
		System.out.println("one parameter method");
		System.out.println(num);
	}
	
	public static void printMethod(int num1,int num2){
		System.out.println("two parameter method");
		System.out.println(num1+num2);
	}
	
	public static void printMethod(int num1,int num2,int num3){
		System.out.println("three parameter method");
		System.out.println(num1+num2+num3);
	}
}

