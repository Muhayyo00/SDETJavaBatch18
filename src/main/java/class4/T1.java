package class4;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
/* You are a loan specialist and need to ask user what amount of loan is needed.
If loan is less or equal to 200,000, then you would lend the money, otherwise, you would reject
the client
 */
        System.out.println("Please enter the loan amount");
        Scanner sc = new Scanner(System.in);
        double loanAmount = sc.nextDouble();
        if (loanAmount <= 200000) {
            System.out.println("You can get this loan");
        } else {
            System.out.println("This amount can't be provided");
        }
    }


}












