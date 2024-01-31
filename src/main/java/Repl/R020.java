package Repl;

import java.util.Scanner;

public class R020 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Please enter your first name");
        String fName=scan.nextLine();
        System.out.println("Please enter your last name");
        String lName=scan.nextLine();
        System.out.println(fName+" "+lName);


    }
}

/* Scanner scanner=new Scanner(System.in);
System.out.println("Please enter first name");
String name=scanner.nextLine();
System.out.println("Please enter the last name");
String lName=scanner.nextLine();
 System.out.println(name+" "+lName);
 */
