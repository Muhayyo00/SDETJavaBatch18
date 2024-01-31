package Project2ReviewAsghar;

public class Q6 {
    /*6. Create a method to count how many vowels are present in a string
“documentation”*/
           public static void main(String[] args) {

            String str="documentation";
            System.out.println(str.replaceAll("[^aeiouAEIOU]","").length());

    }
}
