package class5;

import java.util.Scanner;

public class HW33 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double number1, number2;
        String operator;
        System.out.println("Please enter your first number");
        number1=scan.nextDouble();
        System.out.println("Please enter your second number");
        number2=scan.nextDouble();
        System.out.println("Please enter one of the following operators:+,-,*,/");
        operator=scan.next();
        switch (operator) {
            case "+":
            System.out.println(number1+number2);
            break;
            case "-":
            System.out.println(number1-number2);
            break;
            case "*":
            System.out.println(number1*number2);
            break;
            case "/":
            System.out.println(number1/number2);
            break;
        }

    }
}
