package class15;

public class T1 {
    /* Write a java class that will have a constructor. One with parameters and the second
    without any parameters. Create a separate Test class where you will execute both of the
    constructors 1 by 1.
     */


    T1(String name, double salary, String ID) {
        System.out.println("With parameters");
    }
    T1() {
        System.out.println("Empty");
    }
}
