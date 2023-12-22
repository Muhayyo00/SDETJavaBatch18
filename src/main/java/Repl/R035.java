package Repl;

import java.util.Scanner;

public class R035 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan = sc.nextBoolean();
        if (loan == true){
            System.out.println("What is your credit score?");
            int Score = sc.nextInt();
            if (Score < 600){
                System.out.println("The eligibility is Not eligible.");
            }
            else if (Score >=600 && Score <=700){
                System.out.println("The eligibility is Maybe eligible.");
            }
            else if (Score > 700 && Score<=800){
                System.out.println("The eligibility is Eligible.");
            }else if (Score > 800){
                System.out.println("The eligibility is Definitely eligible.");
            }

        }else{
            System.out.println("Unknown");
        }
    }
}
