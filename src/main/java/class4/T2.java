package class4;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        /* You are DMV representative and need to ask customer their age.
 If they are 18 or older you will issue a driver license to them, otherwise you will offer
 them to get a learners permit.
 */

        Scanner abc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = abc.nextInt();
        if(age>=18) {
            System.out.println("You will be issued a drivers license");
        }else {
            System.out.println("Get learner's permit for now");
        }
    }


}


