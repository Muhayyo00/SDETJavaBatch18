package class22;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        /*Create an arraylist of cars and retrieve all the values using 2 different ways
         */
        ArrayList <String> cars=new ArrayList<>();
        cars.add("Chevrolet");
        cars.add("Toyota");
        cars.add("Lexus");
        cars.add("Kia");
        cars.add("Mercedes");

        System.out.println("First Way: ");
        for (int i = 0; i < cars.size(); i++) {
        String s=cars.get(i);
         System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("Second Way:");
        for(String c: cars){
            System.out.print(c+" ");
        }





    }
}
