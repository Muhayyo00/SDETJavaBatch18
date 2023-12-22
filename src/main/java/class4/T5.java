package class4;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        /* Write a program to ask user to enter number of worked years and annual salary.
        If user worked for more or equal to 5 years, then the user is eligible for the bonus,
        otherwise, he is not. Once user is eligible and salary is larger than 50000 than bonus=5000,
        otherwise, bonus=3000.
                 */

        Scanner sc=new Scanner(System.in);
        System.out.println("How many years have you worked?");
        int numberYearsWorked=sc.nextInt();
        if(numberYearsWorked>=5) {
            System.out.println("You are eligible for the bonus");
            System.out.println("What's your salary?");
            sc.nextDouble();
            double salary=sc.nextDouble();
            if(salary>5000) {
                System.out.println("Your bonus is 5000");
            }else if(salary<5000) {
                System.out.println("Your bonus is 3000");
            }
        }else{
            System.out.println("You are not eligible for the bonus");
        }



    }
}
