package class5;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        /* Write a program that will prompt the user for Day number and print whether
        it is a weekend or weekday.
        If any day from 1-5->output"It is a weekday", any day from 6-7->"It ia a weekend".
        And any other day -> output "Invalid day". Test your task for -1 3 6 and 8.
         */
Scanner scan=new Scanner(System.in);

        System.out.println("Enter the number 1-7");
        int dayNumber=scan.nextInt();
        if(dayNumber>=1&&dayNumber<=5) {
            System.out.println("It is a weekday");
        }else if(dayNumber==6||dayNumber==7) {//or (dayNumber>=6&&dayNumber<=7)
            System.out.println("It is a weekend");
        }else{
            System.out.println("Invalid day");
        }



    }
}
