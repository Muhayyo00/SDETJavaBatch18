package class12;

public class T8InterviewQ {
    public static void main(String[] args) {
        // How would you check if String is palindrome or not? aba=>true, Abbc=>false
        String str="Car";
        String reverseWord="";
        for (int i = str.length()-1; i>=0; i--) {
            reverseWord=reverseWord+str.charAt(i);
            }
        System.out.println(reverseWord);
        if(str.equalsIgnoreCase(reverseWord)) {
            System.out.println("Its a Palindrome");
        }else{
            System.out.println("Its not a Palindrome");
        }
    }
}
