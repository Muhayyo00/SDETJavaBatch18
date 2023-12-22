package class15;

public class Teacher {
    /* Write a Teacher class that has instance variables for name and address.
    Create a constructor that will initialize those variables. Print name & address of
    given teacher using displayInfo method.
     */

    private String name;
    private String address;
    private int age;
    private double weight;

    public Teacher(String name, String address, int age, double weight){
        //this.name=name;
        //this.address=address;
        //this.age=age;
        /*2 constructors have exactly same information. Instead of repeating same information,
        we can simply write this(name, address, age). NOTE: this method comes first and then
        the rest of the variables.*/
        this(name, address, age);
        this.weight=weight;
    }

    public Teacher(String name, String address, int age){
        this.name=name;
        this.address=address;
        this.age=age;


    /*void displayInfo() {
        System.out.println(name+" "+address+" "+age+" "+weight);
    }

    public static void main(String[] args) {
        Teacher n=new Teacher("Asghar", "1524 Ash Street, 80204, Denver, Colorado");
        n.displayInfo();*/
    }
}
