package project1Java;

public class Q5 {
    public static void main(String[] args) {
        /* Write a program to swap 2 numbers without a temporary variable?
         */
        int x=15;
        int y=30;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("first way of swapping 2 numbers without a temporary variable");
        System.out.println("Variable x is: "+x);
        System.out.println("Variable y is: "+y);

        System.out.println();
        System.out.println("Second way of swapping 2 numbers without a temporary variable");

        int a=15;
        int b=30;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Variables a is: "+a);
        System.out.println("Variables b is: "+b);





    }
}
