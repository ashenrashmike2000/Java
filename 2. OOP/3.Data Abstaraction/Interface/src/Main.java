public class Main {
    public static void main(String[] args) {
            //IA a = new IA();
        IA b = new C();
    }
}

interface IA{//runnable
    void run1();
    void run2();
    void run3();
    void run4();
    void run5();

}

class C implements IA{

    @Override
    public void run1() {

    }

    @Override
    public void run2() {

    }

    @Override
    public void run3() {

    }

    @Override
    public void run4() {

    }

    @Override
    public void run5() {

    }
}