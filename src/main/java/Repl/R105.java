package Repl;

import java.util.Scanner;

public class R105 {
    public static void main(String[] args) {
        Scanner  inp=new Scanner(System.in);
        System.out.println("In:");
        String word=inp.nextLine();
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.replaceAll("[^a, o, e, i, y, u]", ""));
            }


        }

    }

