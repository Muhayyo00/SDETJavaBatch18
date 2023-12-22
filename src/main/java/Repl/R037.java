package Repl;

import java.util.Scanner;

public class R037 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean thirsty=scan.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean sleepy=scan.nextBoolean();
        if(thirsty&&!sleepy) {
            System.out.println("Looks like you need to drink water");
        }else if(thirsty&&sleepy) {
            System.out.println("Looks like you need to drink coffee");
        }else if(!thirsty&&sleepy) {
            System.out.println("Looks like you need to drink tea");
        }else {
            System.out.println("Looks like you need to drink nothing");
        }
    }
}
