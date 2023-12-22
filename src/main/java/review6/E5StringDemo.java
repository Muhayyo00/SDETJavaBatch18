package review6;

public class E5StringDemo {
    public static void main(String[] args) {
        String str="Today is a JAVA review class";
        System.out.println(str.contains("java"));//true
        System.out.println(str.contains("Python"));//false
        System.out.println(str.contains("c"));//true
        str.toLowerCase().contains("java");
    }
}
