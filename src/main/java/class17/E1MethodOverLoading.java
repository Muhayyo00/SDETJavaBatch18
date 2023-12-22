package class17;
class MathDemo2 {
    static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    static void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }
    static void add(double num1, double num2, double num3) {
        System.out.println(num1 + num2 + num3);
    }
    static void add(double num1, int num2) {
        System.out.println(num1 + num2);
    }
    static void add(int num1, double num2) {
        System.out.println(num1 + num2);
    }
}
public class E1MethodOverLoading {

    public static void main(String[] args) {
        /*Name of the method combined with its parameters is called signature of overloading
        This is called Method Overloading.
        Header is written type, access modifier and method used.
        Method Overloading happens when-same name methods but with different parameters.
        When you overload the method, others who use your methods, will be able to add
        a lot of types of data with one method.You basically make their lives easier.
        1. Creating same methods and method names, but different parameters.compare lines 6 and 9.
        2. We can also change data types.lines 3 and 6, compare.
        3.We can also do Overloading method by changing the same parameters and data types,
        but different sequence.Compare lines 15 and 19.*/

        MathDemo2.add(10, 20);
        MathDemo2.add(15.5, 25.5);
        MathDemo2.add(15.5, 25.5, 25.5);
        System.out.println("name");
        System.out.println(10);
        System.out.println(true);


    }
}
