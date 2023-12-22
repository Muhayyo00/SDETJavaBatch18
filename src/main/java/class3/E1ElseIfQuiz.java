package class3;

import org.w3c.dom.ls.LSOutput;

public class E1ElseIfQuiz {
    public static void main(String[] args) {
        int age = 20;
        if (age < 1) {
            System.out.println("Baby");
        } else if (age < 15) {
            System.out.println("teenager");

        } else if (age < 30) {
            System.out.println("Still Young");
        } else if (age < 50) {
            System.out.println("A Little old");
        } else {
            System.out.println("Old");
        }


        int month = 20;
        if (month == 1) {
            System.out.println("January");
        } else if (month == 2) {
            System.out.println("February");
        } else if (month == 3) {
            System.out.println("March");
        } else if (month == 4) {
            System.out.println("April");
        } else if (month == 5) {
            System.out.println("May");
        } else if (month == 6) {
            System.out.println("June");
        } else if (month == 7) {
            System.out.println("July");
        } else if (month == 8) {
            System.out.println("August");
        } else if (month == 9) {
            System.out.println("September");
        } else if (month == 10) {
            System.out.println("October");
        } else if (month == 11) {
            System.out.println("November");
        } else if (month == 12) {
            System.out.println("December");
        } else {
            System.out.println("Wrong Month");
        }


        int num = 10;
        if (num > 0) {
            System.out.println("It is positive");
        }else if (num < 0) {
        System.out.println("It is negative");
    }else {
            System.out.println("It is zero");

        }

int number=13;
        if(number%2==0){
            System.out.println(number+" is an even number");
        }else{
            System.out.println(number+" is Odd");
        }





    }
}
