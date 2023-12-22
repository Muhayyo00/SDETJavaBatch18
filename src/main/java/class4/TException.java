package class4;

import java.util.Scanner;

public class TException {
    public static void main(String[] args) {
        System.out.println("Please enter your age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println("Please enter your full name");
        //it's going to consume that enter press
        sc.nextLine();
        String fullName=sc.nextLine();
        System.out.println("Your name is "+fullName+" and you are "+age+" old");
    }
}
