public class Main {

    public static void main(String[] args) {
        Person p1 = new Person(1,"Sunil");
        Employee e1 = new Employee(2,"Kamal",20000);
        System.out.println(e1.id);
    }
}

class Person{
    int id;
    String name;

    public Person(int id,String name){
        this.id=id;
        this.name=name;
    }
}

class Employee extends Person{
    int salary;

    public Employee(int id,String name,int salary){
        super(id,name);
        this.salary=salary;
    }
}