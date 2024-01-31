package Repl;

import java.util.Scanner;

public class R036 {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two strings");
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();
        System.out.println("Please enter two numbers");
        int int1 = scan.nextInt();
        int int2 = scan.nextInt();
        if ((int1 == int2) && word1 == (word2)) {
            System.out.println("AND");
        } else if ((int1 == int2) || word1.equals(word2)) {
            System.out.println("OR");
        } else if (int1 != int2 && !word1.equals(word2)) {
            System.out.println("NONE");
        }*/

Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two strings: ");
        String word1=scanner.nextLine();
        String word2=scanner.nextLine();
        System.out.println("Please enter two numbers: ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

        if((num1==num2) && (word1.equals(word2))){
            System.out.println("AND");
        }else if ((num1==num2)||(word1.equals(word2))){
            System.out.println("OR");
        }else{
            System.out.println("NONE");
        }


















    }
    }

