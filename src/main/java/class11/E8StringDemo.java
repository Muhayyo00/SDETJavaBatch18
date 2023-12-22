package class11;

public class E8StringDemo {
    public static void main(String[] args) {
        String str="Today is Saturday";
        System.out.println(str.indexOf('T'));//print the index of 'T', which is zero
        System.out.println(str.indexOf('o'));//prints index 1
        System.out.println(str.indexOf('S'));//prints index 9
        System.out.println(str.indexOf('a'));//prints the index of the first 'a'.index 3.
        System.out.println(str.indexOf('Z'));//will get -1, because Z doesn't exist here.


    }
}
