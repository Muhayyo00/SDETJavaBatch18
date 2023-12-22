package class4;

public class E2NestedIfConditions {
    public static void main(String[] args) {
        double budget = 25000;
        String engineType = "Patrol";
        if (budget >= 50000) {
            if (engineType.equals("Electric")) {
                System.out.println("I want to buy a Tesla");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("I want to buy a Toyota");
            } else {
                System.out.println("I want to buy a Porsche");
            }
        } else if (budget >= 30000) {
            if (engineType.equals("Electric")) {
                System.out.println("I want to buy BYD");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("I want to buy Camtry");
            } else {
                System.out.println("I want to buy Hyundai Sonata");
            }
        } else if (budget >= 20000) {
            if (engineType.equals("Electric")) {
                System.out.println("I want to buy Nissan Leaf");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("I want to buy Kia");
            } else {
                System.out.println("I want to buy Honda Civic");
            }
        } else {
            System.out.println("Let's save more");
        }

        /* Create a Java program and call it a Donor.
        In order to be eligible to donate your blood you have to be 18 years old.
        Also once you identify age eligibility then we have to see if person matches weight requirements.
        If person weight it more than 110 lbs → then he/she is eligible,
        otherwise we cannot accept such a patient.
        */

        double age = 20;
        double weight = 180;
        if (age >= 18) {


            if (weight >= 110) {
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("You are not eligible to donate blood");
            }
        } else {
            System.out.println("We cannot accept such a patient");

        }


/* Write a program to find the largest number among three numbers stored in three
 variables called as num1, num2, num3 using nested if (numbers must be distinct)
 */
        int num1 = 200;
        int num2 = 300;
        int num3 = 100;

        if (num1 > num2) {
            if (num1 > num3){
                System.out.println("Num1 is the largest "+num1);

        }
    }else{
        if (num2>num3) {
                System.out.println("Num2 is the largest "+num2);
            }else{
            System.out.println("Num3 is the largest "+num3);
        }


        }
        }






    }




