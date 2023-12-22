package Repl;

import java.util.Scanner;

public class R076 {
    /* Write a program that creates a String array with size 7.
Ask the user to input Days of a week beginning with Sunday using Scanner class.
Add these inputs to your array and then print all values from that array
Example:
Please enter day 1 of the week
Sunday
Please enter day 2 of the week
Monday

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String []days=new String [7];

        for(int i=0; i<days.length; i++) {
            String day=scan.next();
            days[i]=day;
        }
        for (int j=0; j<=days.length;j++) {
            System.out.println(days[j]);
        }

        //2nd way
        Scanner sc = new Scanner(System.in);
        String day1 = sc.next();
        System.out.println("Please enter day 1 of the week" + " ");
        String day2= sc.next();
        System.out.println("Please enter day 2 of the week" + " ");
        String day3 = sc.next();
        System.out.println("Please enter day 3 of the week" + " ");
        String day4 = sc.next();
        System.out.println("Please enter day 4 of the week" + " ");
        String day5 = sc.next();
        System.out.println("Please enter day 5 of the week" + " ");
        String day6 = sc.next();
        System.out.println("Please enter day 6 of the week" + " ");
        String day7 = sc.next();
        System.out.println("Please enter day 7 of the week" + " ");
        System.out.println();

        String[] names = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println(names[0] + " ");
        System.out.println(names[1]+ " ");
        System.out.println(names[2]+ " ");
        System.out.println(names[3] + " ");
        System.out.println(names[4]+ " ");
        System.out.println(names[5] + " ");
        System.out.println(names[6] + " ");

//3rd way
        String[] array=new String[7];
        Scanner sca=new Scanner(System.in);
        for(int i=0; i<array.length; i++) {
            System.out.println("Please enter day "+(i+1)+" of the week");
            array[i]=sca.next();
        }
        System.out.println("Here are all days of the week you have entered");
        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]+" ");
        }








    }






}
