package Repl;

import java.util.Scanner;

public class R022 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scan.nextLine();
        System.out.println("Enter your mobile number");
        String mNumber=scan.nextLine();
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("Your name is "+name+", your age is "+age+" and your mobile number is "+mNumber);

    }
}
