package Repl;

import java.util.Scanner;

public class R026 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("In:");
        String name=scan.nextLine();
        String Chen;
        if(name.equalsIgnoreCase("Chen")) {
            System.out.println("teacher");
        }else{
            System.out.println("student");
        }


    }
}
