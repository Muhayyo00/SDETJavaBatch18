package Repl;

import java.util.Scanner;

public class R033 {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num, remainder;
        num = scan.nextInt();
        scan.close();
        remainder = num % 2;
        if (remainder == 0) {
            System.out.println("Value is even");
            if(num>1000&&remainder==0) {
                System.out.println("Even value is large");
            }else{
                System.out.println("Even value is just right");
            }
        }

        if(remainder!=0) {
            System.out.println("Value is odd");
              if(num>1000&&remainder!=0) {
                  System.out.println("Odd value is large");
              }else{
                  System.out.println("Odd value is just right");
              }
                }


*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");
        int num, remainder;
        num=scanner.nextInt();
        scanner.close();
          remainder=num%2;
           if(remainder==0){
            System.out.println("Value is even");
            if(num>1000&&remainder==0){
                System.out.println("Even value is large");
            }else{
                System.out.println("Even value is just right");
            }
        }
        if(remainder!=0){
            System.out.println("Value is odd");
            if(num>1000 && remainder!=0){
                System.out.println("Odd value is large");
            }else{
                System.out.println("Odd value is just right");
            }
        }






    }}
























