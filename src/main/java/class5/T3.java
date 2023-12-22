package class5;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        /* Write a program that will ask user to input inputs the current time (use 24 hours format).
         Based on the given time, define:
         If hour is between 1-11->Morning;
         If hour is between 12-15-> Afternoon;
         If hour is between 16-20->Evening;
         If hour is between 21-24-> Night.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("What is the current time?");
        int hour=scan.nextInt();
        if(hour>=1&&hour<=11) {
            System.out.println("It is Morning!");
        }else if(hour>=12&&hour<=15) {
            System.out.println("It is Afternoon!");
        }else if(hour>=16&&hour<=20) {
            System.out.println("It is Evening!");
        }else if(hour>=21&&hour<=24) {
            System.out.println("It is night!");
        }else{
            System.out.println("Invalid hour!");
        }
        scan.close();//means STOP Scanner!!!!
    }
}
