package Repl;

public class R114 {
    void multiply(int num1, int num2) {
        System.out.println(num1*num2);
    }
    void add(int num1, int num2) {
        System.out.println(num1+num2);
    }
    void subtraction(int num1, int num2) {
        System.out.println(num1-num2);
    }


    public static void main(String[] args) {
        R114 f=new R114();
        System.out.print("Addition ");
        f.add(10, 20);
        System.out.print("Multiplication ");
        f.multiply(2, 15);
        System.out.print("Subtraction ");
        f.subtraction(30, 10);
    }
}
