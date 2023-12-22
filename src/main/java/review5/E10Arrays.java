package review5;

import java.util.Arrays;
import java.util.Scanner;

public class E10Arrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the size of the Array");
        int size=scanner.nextInt();
        int [] numbers=new int[size];
        System.out.println(numbers.length);

         for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter the number"+(i+1));
            numbers[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));




    }
}
