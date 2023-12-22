package review7;

public class OverLoadPrivate {
    /* Create 1 class with a private method that has 3 overloaded forms. Then call each
     overloaded method with specific arguments and observe result.
     */
    private static void add(int n1, int n2, int n3, int n4) {
        System.out.println(n1 + n2 + n3);
    }
    private static void add(int n1, double n2, int n3, double n4) {
        System.out.println(n1 + n2 + n3);
    }
   private static void add ( double n1, double n2, int n3, int n4){
            System.out.println(n1 + n2 + n3);
        }

    public static void main(String[] args) {
        OverLoadPrivate.add(12, 2, 5, 9);
        OverLoadPrivate.add(5, 2.3, 10, 1.1);
        OverLoadPrivate.add(1.0, 2.7, 5, 7);

    }
    }
