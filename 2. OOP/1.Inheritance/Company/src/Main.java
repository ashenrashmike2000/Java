public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager();
        manager1.empID=1;
        manager1.name="M1";
        manager1.birthday="1996/02/12";
        manager1.managerID=1;

        manager1.eat();

        Accountant accountant1 = new Accountant();
        accountant1.empID=2;
        accountant1.name="A1";
        accountant1.birthday="1997/01/12";
        accountant1.accountID=1;

        Cleaner cleaner1 = new Cleaner();
        cleaner1.empID=3;
        cleaner1.name="C1";
        cleaner1.birthday="1990/03/12";
        cleaner1.cleanerID=1;


    }
}