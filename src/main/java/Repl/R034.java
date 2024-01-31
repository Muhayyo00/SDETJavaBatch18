package Repl;

import java.util.Scanner;

public class R034 {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers 4 5 and 14");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();


               if (num1>2 && num1>3) {
                   System.out.println("The largest number is "+num1);
            }else if(num2>1 && num2>3) {
                   System.out.println("The largest number is "+num2);
            }else {
                   System.out.println("The largest number is "+num3);
            }























    }
}
