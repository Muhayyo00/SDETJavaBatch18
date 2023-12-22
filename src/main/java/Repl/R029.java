package Repl;

import java.util.Scanner;

public class R029 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter first number");
        double fNum=scan.nextDouble();
        System.out.println("Please enter second number");
        double sNum=scan.nextDouble();
        if(fNum*sNum>=0) {
            System.out.println("true");
        }if(fNum*sNum<0) {
            System.out.println("false");
        }
    }
}
