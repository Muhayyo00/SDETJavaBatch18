package class14;

public class HW1 {
    /* Create a method that will accept a String as a parameter and return new String that
    consists only of vowels. Method should be available inside the class and only where
    it was declared and executed by calling its name.
     */
    private static String vowel(String word) {
        String vowel1=word.replaceAll("[^ a,o,u,i,e]", "");
        return vowel1;
   }
    public static void main(String[] args) {
        HW1 hw=new HW1();
        String word=hw.vowel("Tavallud");
        System.out.println(word);
    }
}
