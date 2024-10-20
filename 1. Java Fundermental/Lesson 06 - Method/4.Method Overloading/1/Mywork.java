class Mywork{
	public static void main(String args[]){
		//part 1
		printMethod(10);
		printMethod(1.23);
		printMethod(true);
	}
	
	public static void printMethod(int num){
		System.out.println("This is integer method");
		System.out.println(num);
	}
	
	public static void printMethod(double num){
		System.out.println("This is double method");
		System.out.println(num);
	}
	
	public static void printMethod(boolean bool){
		System.out.println("This is boolean method");
		System.out.println(bool);
	}
}
