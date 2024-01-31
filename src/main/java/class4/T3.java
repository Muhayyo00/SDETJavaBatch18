package class4;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {

/* Create a JAVA program that will ask user to input city and temperature.
Your program should convert Fahrenheit into Celsius and print "The temperature in the city______ is___"
 */

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your city");
        String city=sc.nextLine();
        System.out.println("Please enter the temperature in "+city);
        double temp=sc.nextDouble();
        double tempInCelsius=(temp-32)*5.0/9.0;
        System.out.println("Temperature in "+city+" is "+tempInCelsius+"c");



    }
}
