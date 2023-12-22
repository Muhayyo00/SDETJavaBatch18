package Repl;

import java.util.Scanner;

public class R100 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("In:");
        String s=inp.nextLine();
        String reverse="";


        for (int i = s.length()-1; i>=0; i--) {
           reverse=reverse+s.charAt(i);//or reverse+=s.charAt(i);

        }
        System.out.print(reverse);


    }
}
