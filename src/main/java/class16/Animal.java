package class16;

public class Animal {
    //if parent class has an attribute/method in private access mode, the child classes cannot access it.
    String name;
    String color;
    int age;
    double weight;

    void sleep(){
        System.out.println("ZZZZZzzzzzZZZZZ");
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}
