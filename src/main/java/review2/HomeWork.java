package review2;

public class HomeWork {
    public static void main(String[] args) {
/* 1.Write a program to store a value whether user has degree or not.
If user has a degree, you should say congratulations and after that check  If gpa score
is higher or equals to 3.5 → output should say “You are eligible for scholarship”,
otherwise → “You should have studied harder” . if user does not have a degree,
print you should get a degree
 */
        boolean hasDegree=true;
        double gpa=3.8;
        if(hasDegree) {
            System.out.println("Congratulations");
            if(gpa>=3.5) {
                System.out.println("You are eligible for a scholarship");
            }else {
                System.out.println("You should have studied harder");
            }
        }else{
            System.out.println("You should get a degree");
        }




/* 2.Create a Java program and store values of mortgage rate and mortgage price.
First, program should check if rate is higher than 4.5 user will not buy a house,
otherwise user will consider buying. Once user decides to buy a house, if price of the house
is larger than 100,000 than user will take a loan, otherwise user will pay cash.
 */

double mortgageRate=4.5;
        double mortgagePrice=120.000;
if (mortgageRate>4.5) {
    System.out.println("Will not buy a house");
}else {
    System.out.println("Will consider buying a house");
}if (mortgagePrice>100.000) {
            System.out.println("The User will take a loan");
        }else {
            System.out.println("The user will pay cash");
        }



    }
}
