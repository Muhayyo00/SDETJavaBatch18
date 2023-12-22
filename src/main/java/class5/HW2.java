package class5;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        /*Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent,
         B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
         should print which grade was entered by a user with explanation.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your grade");
        String grade=scan.next();
        if(grade.equalsIgnoreCase("A")) {
            System.out.println("A-Excellent");
        }else if(grade.equalsIgnoreCase("B")) {
            System.out.println("B-Good");
        }else if(grade.equalsIgnoreCase("C")) {
            System.out.println("C-Average");
        }else if(grade.equalsIgnoreCase("D")) {
            System.out.println("D-Bad");
        }else if(grade.equalsIgnoreCase("F")) {
            System.out.println("F-Fail");
        }else{
            System.out.println("Not Acceptable");
        }







            }
        }








