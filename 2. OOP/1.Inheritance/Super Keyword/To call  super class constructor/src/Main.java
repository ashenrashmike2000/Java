public class Main {
    public static void main(String[] args) {
        B b = new B(5);
    }
}
class A{
    public A(){
        System.out.println("A");
    }

    public A(int a){
        System.out.println("A with int");
    }
}

class B extends A{
    public B(){
        super(4);
        System.out.println("B");
    }

    public B(int b){
        super();
        System.out.println("B with int");
    }
}