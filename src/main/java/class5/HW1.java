package class5;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        /*Ask user to enter a number and then categorize if number is small, medium or large
        Small number is value between 1 and 10
        Medium number is value between 11 and 100
        Large number is value between 101 and 1000
        */
Scanner scan=new Scanner (System.in);
        System.out.println("Please enter a number");
        double num=scan.nextDouble();
        String small, medium, large, number;
        if(num>=1&&num<=10) {
            number="small";
        }else if(num>=11&&num<=100) {
            number="medium";
        }else if(num>=101&&num<=1000){
        number="large";
        }else{
            number="Invalid";
        }
        System.out.println("This number is "+number);





    }
}
