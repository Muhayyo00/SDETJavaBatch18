package Repl;

import java.util.Scanner;

public class R095 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("The first 3 letters of______ is____");
        String letters=scanner.nextLine();
        System.out.println(letters.substring(0, 3));


    }
}
