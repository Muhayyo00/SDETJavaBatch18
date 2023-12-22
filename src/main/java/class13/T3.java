package class13;

public class T3 {
    /*Create a method that will print whether given String is
    Palindrome or not
     */
    void isPalindrome(String word) {
        String reverseword="";
        for (int i = word.length()-1;i>=0; i--) {
            reverseword+=word.charAt(i);
            if(word.equalsIgnoreCase(reverseword)) {
                System.out.println("It is a Palindrome");
            }else{
                System.out.println("Not a Palindrome");
            }
        }

    }
}
