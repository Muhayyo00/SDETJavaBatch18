package Repl;

import java.util.Scanner;

public class R038 {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
        System.out.println("Is it a weekend?");
        boolean weekend=scan.nextBoolean();
       if(!weekend) {
            System.out.println("Today you will be learning manual testing");
        }else{
            System.out.println("Today you will be learning Java");
        }








    }
}
