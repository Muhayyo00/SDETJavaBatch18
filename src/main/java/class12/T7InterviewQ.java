package class12;

public class T7InterviewQ {
    public static void main(String[] args) {
        // How would you check if String is palindrome or not? aba=>true, Abbc=>false
        String name="MoM";
        String reverse="";
        for (int i = name.length()-1;i>=0; i--) {
            reverse +=name.charAt(i);
        }
        System.out.println(reverse);
        if(name.equals(reverse)) {
            System.out.println("it is palindrome");
        }else{
            System.out.println("not palindrome");
        }



    }
}
