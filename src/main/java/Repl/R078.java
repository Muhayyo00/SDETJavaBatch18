package Repl;

import java.util.Scanner;

public class R078 {
    public static void main(String[] args) {
int []array= new int [5];
        Scanner scan=new Scanner(System.in);
        for (int i=0; i<array.length; i++) {
            array [i]=scan.nextInt();
            System.out.println((array[i]*10));
        }

    }
}
