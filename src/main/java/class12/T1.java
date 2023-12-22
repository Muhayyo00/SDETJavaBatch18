package class12;

public class T1 {
    /*Create a String that will hold a sentence. Write a program to get a new
    String without any spaces.
     */
    public static void main(String[] args) {
        String str=" It is a snowy day today ";
        String newStr=str.replaceAll(" ", "");
        System.out.println(newStr);
    }
}
