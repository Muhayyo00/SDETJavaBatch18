package review6;

public class E2StringDemo {
    public static void main(String[] args) {

        String str="   ";
        System.out.println(str.isEmpty());//counts space
        System.out.println(str.isBlank());//does not count space
        //str.isEmpty().isBlank();//cannot be used together
        String str2="Java ";
        str2.trim().isBlank();//we can only chain those methods where previous method
        // returns the form(int, boolean, string)that next method requires.
        // The output of previous method should match the input of next method.



    }
}
