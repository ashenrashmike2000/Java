class CheckDatatypes{
	public static void main(String args[]){
		int number1 = 100;//integer
		int number2 = 0B1101;//integer
		long number3 = 200;//integer
		float flnum1 = 1.2345f;//float
		double flnum2 = 1.2345;//float
		boolean bool = false; //boolean
		char charactor = 'C'; //charactor
		String name = "Kamal"; //String
		
		System.out.println(((Object)number1).getClass().getSimpleName());
		System.out.println(((Object)number2).getClass().getSimpleName());
		System.out.println(((Object)number3).getClass().getSimpleName());
		System.out.println(((Object)flnum1).getClass().getSimpleName());
		System.out.println(((Object)flnum2).getClass().getSimpleName());
		System.out.println(((Object)bool).getClass().getSimpleName());
		System.out.println(((Object)charactor).getClass().getSimpleName());
		System.out.println(((Object)name).getClass().getSimpleName());
	}
}
