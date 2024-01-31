package class12;

public class T5InterviewQ {
    public static void main(String[] args) {
        // How would you reverse a sentence?

        String sen="This is the sentence I want to reverse";
        String reverse="";
        for (int i = sen.length()-1;i>=0; i--) {
            reverse +=sen.charAt(i);
        }
        System.out.println(reverse);



        }
    }

