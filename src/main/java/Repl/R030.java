package Repl;

import java.util.Scanner;

public class R030 {
    public static void main(String[] args) {
       /*For you to do:**
        Write a program to take the month number from a user.
        Provide month name to the corresponding month number
        If a user provides any number that is out of month range, the program should display "Invalid"
        IMPORTANT: use Scanner Class
        **Example Output:**
        Please enter month number 1
        January
        **Example Output:**
        Please enter month number 33
        Invalid
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter month number");
        double mNum=scan.nextDouble();
        String January, February, March, April, May, June, July,
                August, September, October, November,
                December;
        if(mNum==1) {
            System.out.println("January");
        }else if(mNum==2) {
            System.out.println("February");
        }else if(mNum==3) {
        System.out.println("March");
    }else if(mNum==4) {
            System.out.println("April");
    }else if(mNum==5) {
            System.out.println("May");
            }else if(mNum==6) {
                System.out.println("June");
                }else if(mNum==7) {
                    System.out.println("July");
            }else if(mNum==8) {
                    System.out.println("August");
            }else if(mNum==9) {
                System.out.println("September");
        }else if(mNum==10) {
            System.out.println("October");
        }else if(mNum==11) {
            System.out.println("November");
        }else if(mNum==12) {
            System.out.println("December");
        }else {
            System.out.println("Invalid");
        }
        }
}
