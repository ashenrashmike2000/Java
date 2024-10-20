class Mywork {

    public static void main(String[] args) {
        //Loop lable
        
        L1 :
        for (int i = 1;(i <= 20);i++){
            L2 :
            for (int j = 1;(j <= i);j++){
                if (i == 5) break L1;
		System.out.print("*");
            }
            System.out.println("");
	}
    }
    
}

