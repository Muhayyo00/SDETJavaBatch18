package class11;

public class HW {
    public static void main(String[] args) {
        //Create a String and print it in reverse order--> Sunday.

        String sun="Sunday";
        for (int i = sun.length()-1;i>=0; i--) {
            System.out.print(sun.charAt(i)+" ");

            System.out.println();
        }
        //second way
        String reverse= "";
        String s="Sunday";
        for (int x = sun.length()-1; x>=0 ; x--) {
            reverse += s.charAt(x)+" ";
        }
        System.out.print(reverse);

    }
}
