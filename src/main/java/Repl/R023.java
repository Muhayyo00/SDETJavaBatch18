package Repl;

import java.util.Scanner;

public class R023 {
    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        System.out.println("Input the boolean value");
        boolean value=scan.nextBoolean();
        String sValue=scan.nextLine();


        if(value) {
            System.out.println("The value is true");
        }else{
            System.out.println("The value is false");
        }



    }
}
