package class5;

import java.util.Scanner;

public class T4 {
    /* Write a program for user to enter his/her birth month.
       Based on the month, define the season.Ex.:if user is born in March, April, May-->season="Spring"
       if user is born in June, July, August-->season="Summer" and etc.
       At the end of the program, we should see 1 output as "You were born in season_______".
        */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What month were you born in?");
        String month = sc.next();
        String season;
        if (month.equalsIgnoreCase("March") ||
                month.equalsIgnoreCase("April") ||
                month.equalsIgnoreCase("May")) {
            season = "Spring";
        } else if (month.equalsIgnoreCase("June") ||
                month.equalsIgnoreCase("July") ||
                month.equalsIgnoreCase("August")) {
            season = "Summer";
        } else if (month.equalsIgnoreCase("September") ||
                month.equalsIgnoreCase("October") ||
                month.equalsIgnoreCase("November")) {
            season = "Autumn";
        } else if (month.equalsIgnoreCase("December") ||
                month.equalsIgnoreCase("January") ||
                month.equalsIgnoreCase("February")) {
            season = "Winter";
        } else {
            season = "Invalid";
        }

        System.out.println("You were born in " + season);


    }
}
