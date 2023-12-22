package Repl;

import java.util.Scanner;

public class R034 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers 4 5 and 14");
        int num=scan.nextInt();
        int num1=4;
        int num2=5;
        int num3=14;
               if (num1>2||num1>3) {
                System.out.println("The largest number is "+num1);
            }else if(num3>2||num3>1) {
                System.out.println("The largest number is "+num3);
            }else if(num2>num3){
                System.out.println("The largest number is "+num2);
            }
    }
}
