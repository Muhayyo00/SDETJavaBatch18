package Repl;

import java.util.Scanner;

public class R099 {
    public static void main(String[] args) {
Scanner inp=new Scanner(System.in);
System.out.print("In:");
        String givenString=inp.nextLine();
        String reverseWord="";
        for (int i = givenString.length()-1; i>=0; i--) {
            reverseWord=reverseWord+givenString.charAt(i);
        }
        if(givenString.equalsIgnoreCase(reverseWord)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
