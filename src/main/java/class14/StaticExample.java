package class14;

public class StaticExample {
    /*Create a static method with int return type. Call it dValue which takes a number
     as an input, multiples it by 2 and returns the value.*/

    static int dValue(int n){
        return n*2;}

    public static void main(String[] args) {
        System.out.println(StaticExample.dValue(10));//prints 20
    }
}
