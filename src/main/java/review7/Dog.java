package review7;

public class Dog {
    private String name;
    private String color;
    private int age;
    private double weight;
    /*Whenever you plan to reuse the variable for more than two methods in your class
    create an instance variable.

    When you need this variable for only this method/if condition/loop or any other
    block of code, use local variable.
     */
    public Dog(String name, String color, int age, double weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}
