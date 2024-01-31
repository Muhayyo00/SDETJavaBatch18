package class12;

public class HW {
    public static void main(String[] args) {
        //How would you swap  2 strings without a temporary variable?
        String a="Hello";
        String b="World";
        System.out.println("Initial order");
        System.out.println(a);
        System.out.println(b);
        //In order to swap two Strings:
        //1.append a and b
        a=a+b;//a will become: HelloWorld
        //2.store initial String a in String b.
        b= a.substring(0,a.length()-b.length());//HelloWorld-World
        //3.Store initial String b in String a
        a=a.substring(b.length());//World
        System.out.println();
        System.out.println("Order after swapping two String words");
        System.out.println(a);
        System.out.println(b);
    }
}
