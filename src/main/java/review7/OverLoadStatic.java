package review7;

public class OverLoadStatic {
    /*Create 1 class with a static method that has 3 overloaded forms. Then call each
     overloaded method with specific arguments and observe result.
     */
    static void multiply(int n1, int n2, int n3) {
        System.out.println(n1*n2*n3);
    }
    static void multiply(double n1, double n2, double n3){
        System.out.println(n1*n2*n3);
    }
    static void multiply(double n1, int n2, double n3){
        System.out.println(n1*n2*n3);
    }

    public static void main(String[] args) {
        OverLoadStatic.multiply(12, 10, 6);
        OverLoadStatic.multiply(2.7, 10, 3.9);
        OverLoadStatic.multiply(1.4, 2.1,4.3);

    }
}
