public class Main {
    public static void main(String[] args) {
            //Man m = new Man();
            Superman s = new Superman();
            Man m1 = new Superman();
    }
}

abstract class Man{
    public void eat(){
        System.out.println("Eat....");
    }

    public abstract void fly();
}

class Superman extends Man{

    @Override
    public void fly() {

    }
}