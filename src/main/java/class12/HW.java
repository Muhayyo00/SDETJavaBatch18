package class12;

public class HW {
    public static void main(String[] args) {
        //How would you swap  2 strings without a temporary variable?
        String word1="Santa";
        String word2="Barbara";
        System.out.println("Initial order");
        System.out.println(word1);
        System.out.println(word2);
        word1=word1+word2;
        word2= word1.substring(0,word1.length()-word2.length());
        word1=word1.substring(word2.length());
        System.out.println();
        System.out.println("Order after swapping two String words");
        System.out.println(word1);
        System.out.println(word2);
    }
}
