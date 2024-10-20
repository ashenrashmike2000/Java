public class Main {
    public static void main(String[] args) {
        Car car1= new Car();
        Car car2= new Car();
        //Car car3= new Car();
        //Car car4= new Car();


        //System.out.println(car1.id);
        System.out.println(Car.numberofCars);

        Car.staticMethod();
        car1.normalMethod();
    }
}

class Car{
    int id;
    static int numberofCars=0;

    public Car(){
        numberofCars=numberofCars+1;
        this.id=numberofCars;
    }

    //not object specified method
    public static void staticMethod(){
        System.out.println("Static Method");
    }

    //object specified method
    public void normalMethod(){
        System.out.println(this);
    }
}