package class14;

public class HW {
    /*Create a method that will take a String as a parameter and return reversed String.
    Method should be available to all classes within your project and accessible
    by class name.
     */
    public static String hw(String word) {
        String reverse="";
        for (int i = word.length()-1; i >=0; i--) {
            reverse+=word.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println(hw("Home Work"));

    }

        }





