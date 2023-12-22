package class5;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        /* Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
         Based on operator provide the result to user. Please complete this assignment in 2 ways:
         using if statement and switch case. */


        Scanner scan=new Scanner(System.in);
        double number1, number2;
        String operator;
        System.out.println("Please enter your first number");
        number1=scan.nextDouble();
        System.out.println("Please enter your second number");
        number2=scan.nextDouble();
        System.out.println("Please enter one of the following operators:+,-,*,/");
        operator=scan.next();
        if(operator.equals("+")) {
            System.out.println(number1+number2);
        }else if(operator.equals("-")) {
            System.out.println(number1-number2);
        }else if(operator.equals("*")) {
            System.out.println(number1*number2);
        }else if(operator.equals("/")) {
            System.out.println(number1/number2);
                }

    }
}
