package class14;

public class PersonTester {
    public static void main(String[] args) {
        Person p1=new Person("Zion", 22, 60, 90000, "Java");
        //p1.name="Zeeshan";
        //p1.age=22;
        //p1.weight=60;
        p1.printInfo();
        System.out.println(Person.numOfEye);
        Person.numOfEye=3;

        Person p2=new Person("Sino", 25, 70, 86000, "Python");
        //p2.name="Sino";
       // p2.age=25;
       // p2.weight=70;
        p2.printInfo();
        System.out.println(Person.numOfEye);

    }
}
