package Repl;

import java.util.Scanner;

public class R097 {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("In:");
        String In=scanner.nextLine();
        if(In.equalsIgnoreCase("Chrome")) {
            System.out.println("Proceed with Chrome browser");
        }else if(In.equalsIgnoreCase("Firefox")) {
            System.out.println("Proceed with Firefox browser");
        }else if(In.equalsIgnoreCase("IE")) {
            System.out.println("Proceed with IE browser");
        }else{
            System.out.println("Invalid browser");
        }
    }
}
