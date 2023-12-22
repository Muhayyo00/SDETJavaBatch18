package project1Java;

public class Q8 {
    public static void main(String[] args) {
        /*Maximum and minimum number in the array?
         */
        int[] num = {137, 306, 35, 133, 456, 68, 261};
        int maximum = num[0];
        int minimum = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]<minimum) {
                minimum = num[i];
            }else if (num[i]>maximum) {
                maximum = num[i];
            }
        }
        System.out.println("The maximum number is "+maximum);
        System.out.println("The minimum number is "+minimum);

    }
}
