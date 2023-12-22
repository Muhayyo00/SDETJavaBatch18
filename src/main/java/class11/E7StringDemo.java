package class11;

public class E7StringDemo {
    public static void main(String[] args) {
        String str="  HELLO  ";//hello
        System.out.println(str.toLowerCase().trim().length());
        /*turn to lower case, trim the extra spaces, and length will calculate the number of letters.
        //if we run that, we will get 5. Because there are 5 letters in Hello.
        if we don't apply trim, we will get 12, because it will count spaces as well.*/


        System.out.println(str.trim().toLowerCase().equals("hello"));
    }
}
