package class5;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
/* Ask the user to enter their country and capture it. Once values are captured,
print which language user speaks. Just do this for 5 countries.
 */

      Scanner sc=new Scanner(System.in);
        System.out.println("What country are you from?");
        String country=sc.nextLine();
                switch (country.toUpperCase()) {
        //or can use (country.toLowerCase())->which will convert everything to lower case

            case "USA":
                System.out.println("You speak English");
                break;
            case "UK":
                System.out.println("You speak English");
                break;
            case "FRANCE":
                System.out.println("You speak French");
                break;
            case "CHINA":
                System.out.println("You speak Mandarin");
                break;
            case "TAJIKISTAN":
                System.out.println("You speak Tajik");
                break;
            default:
                System.out.println("Who knows what language you speak!");
            }
        }





    }

