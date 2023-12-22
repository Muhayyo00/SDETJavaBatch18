package class7;

import java.util.Scanner;

public class E5NestedLoops {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            for (int j=i; j<5; j++) {
                System.out.print("*");
            }
            System.out.println();

        }


//nested loops=a loop inside a loop
        Scanner scanner=new Scanner(System.in);
        int rows;
        int columns;
        String symbol=" ";
        System.out.println("Enter # of rows: ");
        rows=scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns=scanner.nextInt();
        System.out.println("Enter symbol to use");
        symbol=scanner.next();

        for(int i=1; i<=rows; i++) {
            System.out.println();
            for(int j=1; j<=columns; j++) {
                System.out.print(symbol);
            }
        }


    }
}
