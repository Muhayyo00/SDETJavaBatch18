package Repl;

import java.util.Scanner;

public class R041 {
    public static void main(String[] args) {
     Scanner scan=new Scanner (System.in);
        System.out.println("Enter the age of the child");
        int age=scan.nextInt();
        switch(age) {
            case 1:
                System.out.println("You can Crawl");
                break;
            case 2:
                System.out.println("You can Talk");
                break;
            case 3:
                System.out.println("You can Dance");
                break;
            case 4:
                System.out.println("You can get Trouble");
                break;
            default:
                System.out.println("I don't know how old you are");
                break;

        }







    }
}
