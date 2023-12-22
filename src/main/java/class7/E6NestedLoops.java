package class7;

public class E6NestedLoops {
    public static void main(String[] args) {
       for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i; j <5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



        for (int i=1; i<=10; i++) {//multiplication table
            for (int j=1; j<=10;j++) {
                System.out.print((i*j)+" ");
                System.out.println();

            }
        }
    }
}
