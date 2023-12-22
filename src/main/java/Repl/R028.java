package Repl;

import java.util.Scanner;

public class R028 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the length");
        double length=scan.nextDouble();
        System.out.println("Please enter the width");
        double width=scan.nextDouble();
        if(length!=width) {
            System.out.println("The shape of your object is rectangle");
        } if(length==width) {
            System.out.println("The shape of your object is square");
        }

    }
}
