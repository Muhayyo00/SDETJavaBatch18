package class11;

public class E9StringDemo {
    public static void main(String[] args) {
        String str="Today is Saturday";
        System.out.println(str.substring(0,5));//prints indexes 0 through 5:Today
        System.out.println(str.substring(0, 4));//prints Toda.
        System.out.println(str.substring(6, 8));//prints is
        System.out.println(str.substring(9, str.length()));
        String str2="Java is Fun";
        System.out.println(str2.substring(0, 4));//prints Java
        System.out.println(str2.substring(5, 7));//prints is
        System.out.println(str2.substring(8, 11));//prints Fun
    }


}
