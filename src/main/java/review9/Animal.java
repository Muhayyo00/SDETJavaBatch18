package review9;

public abstract class Animal {
    private String name;
    private String color;
    private int age;

    //constructor never ever have a return type NOT even a void
    //constructors behave same as methods. They are actions that a class can do.
public Animal(String name, String color, int age){
this.name=name;
this.color=color;
this.age=age;
}
String getName(){
    return name;//we can also say return this.name; but there is no need.
    //we don't need "this" keyword here. We need this when there is a conflict between inst and local vars.
}
public abstract void eat();
public abstract void speak();
public void printInfo(){
    System.out.println(name+" "+color+" "+age);
}}
class Dog extends Animal{
    String breed;
    public Dog(String name, String color, int age, String breed){
        super(name, color, age);
        this.breed=breed;
    }
    @Override
    public void eat(){
        System.out.println("Dogs love bones and meat");
    }
    @Override
    public void speak(){
        System.out.println("The dog goes bark bark");
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println(breed);
    }
    void run(){
        System.out.println("The dog is running");
    }


}
class Cat extends Animal{

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Cats love fish");
    }

    @Override
    public void speak() {
        System.out.println("The cat goes meow meow");
    }
}

