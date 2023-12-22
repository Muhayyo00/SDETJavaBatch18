package Repl;

import java.util.Scanner;

public class R077 {
    public static void main(String[] args) {
        int []array=new int [5];
        Scanner scan=new Scanner(System.in);

        for(int i=0;i<array.length; i++) {
            array [i]=scan.nextInt();
        }

        for(int i=array.length-1; i>=0; i--) {
            System.out.println(array[i]);

        }
    }
    }

