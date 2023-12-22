package class11;

public class E4StringDemo {
    public static void main(String[] args) {
        String str="Now I Love Java Java is great";
        System.out.println(str.startsWith("Pyhton"));//prints false
        System.out.println(str.startsWith("Now"));//prints true
        System.out.println(str.startsWith(" Now"));//prints false
        System.out.println(str.startsWith("n"));//prints false
        System.out.println(str.startsWith("N"));//true
        System.out.println(str.startsWith(""));//true, even if it is empty, because there is noting before anything :)
        System.out.println(str.endsWith("great"));//true
        System.out.println(str.endsWith("Java"));//false
        System.out.println(str.contains("Java"));//true
        System.out.println(str.contains("Python"));//false


    }
}
