package Repl;

import java.util.Scanner;

public class R063 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("In: ");
        int x;
        x=sc.nextInt();
        for(int i=0; i<x; i++) {
            System.out.print(i+" ");
        }
    }
}
