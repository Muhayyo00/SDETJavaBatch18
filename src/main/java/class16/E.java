package class16;

public class E {
    /*Write a program to inherit class E that has method printF which is static
    and call or reuse that method into class F.
     */
    public static void printF() {
        System.out.println("Hello Batch 18");
    }
}
class F extends E{
    public static void printF() {
        System.out.println("Hello Batch 18");
    }
}

class ETester{
    public static void main(String[] args) {
        F.printF();
    }
}