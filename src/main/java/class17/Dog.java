package class17;
class Animal{
    private String name;
    private String color;
   private int age;
    private double weight;

    /*Whenever we have a parent child relationship, there should be at least one constructor
    that matches the parent one. Like, empty child/Cat class matches parent constructor.
    If you want to access parent's empty constructor, you put Super();. If you want to access
    parent constructor with parameters, you chose Super(String name, String color, int age, double weight);
     */
    public Animal(){//No argument constructor, because no parameters in it. Empty.

    }

    public Animal(String name, String color, int age, double weight){
this.name=name;
this.color=color;
this.age=age;
this.weight=weight;
    }
    public void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}
public class Dog extends Animal {
    Dog(String name, String color, int age, double weight){//child class
        /*THIS is used to access a constructor from same class
        SUPER is used to access constructor from parent class, since parent
        class has everything in private and cannot be accessed by child classes.*/
        super(name, color, age, weight);
    }
}
class Cat extends Animal{//child class that does not want to take anything from parent class
    Cat(){
        System.out.println("Cat");
        //or can say Super(){}, and it will still access the empty parent class.

    }


}