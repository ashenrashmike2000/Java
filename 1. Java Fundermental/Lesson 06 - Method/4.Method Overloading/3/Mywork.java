class Mywork{
	public static void main(String args[]){
		//part 2
		printMethod(10);
		printMethod(10,"Hello");
		printMethod(10,false,'C');
	}
	
	public static void printMethod(int num){
		System.out.println("only integer method");
		System.out.println(num);
	}
	
	public static void printMethod(int num,String para){
		System.out.println("Integer and String method");
		System.out.println(num);
		System.out.println(para);
	}
	
	public static void printMethod(int num,boolean bool,char charactor){
		System.out.println("Integer,boolean and charactor method");
		System.out.println(num);
		System.out.println(bool);
		System.out.println(charactor);
	}
}


