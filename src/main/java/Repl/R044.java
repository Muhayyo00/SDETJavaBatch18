package Repl;

import java.util.Scanner;

public class R044 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String carMark=scan.nextLine();
        String BMW, Toyota, Maserati, unknown;
        switch(carMark) {
            case "BMW":
                System.out.println("Your favorite car is german car");
                break;
            case "Toyota":
                System.out.println("Your favorite car is japanese car");
                break;
            case "Maserati":
                System.out.println("Your favorite car is italian car");
                break;
            default:
                System.out.println("Your favorite car is unknown car");

        }
    }
}
