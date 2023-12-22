package class4;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        /* Create a Java program that will ask if user has a credit card or not.
         If user does not have a credit card than offer them.
         If they do have one ask what is balance on the card?
         If balance of the card is larger than 1000, tell them to pay off immediately,
         otherwise you can tell them that they can spend more.
         */

        Scanner sc=new Scanner (System.in);
        System.out.println("Do you have a credit card?");
        String userHasCreditCard=sc.nextLine();
        if(userHasCreditCard.equals("Yes")) {
            System.out.println("What is balance on your card?");
            double balance = sc.nextDouble();
            if (balance >= 1000) {
                System.out.println("Please, pay off immediately");
            } else {
                System.out.println("You can spend more");
            }
        }else if(userHasCreditCard.equals("No")) {
            System.out.println("Would you like to open one?");
        }
    }
    }
