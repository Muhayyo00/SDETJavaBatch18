package Repl;

import java.util.Scanner;

public class R104 {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name: ");

        for (int i = 0; i< names.length; i++) {
            String n=scan.nextLine();
            names[i]=n;}

        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j].substring(0, 3));






        }
    }
        }











