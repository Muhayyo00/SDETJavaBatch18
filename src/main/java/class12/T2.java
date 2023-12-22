package class12;

public class T2 {
    /* Create a String that should be a combination of letters, numbers and special characters.
    Find out how many Alphabets(abd AZ) characters are there in the String.
     */
    public static void main(String[] args) {
        String str="asmasndjkfl47582742DBOHG0$@$%EY*";

        System.out.println(str.replaceAll("[^A-Za-z]", "").length());



    }
}
