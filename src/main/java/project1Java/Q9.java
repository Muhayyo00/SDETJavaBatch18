package project1Java;

public class Q9 {
    public static void main(String[] args) {
        /* Write a java program to find the second largest number in the array.
         */
        int[] num = {43, 23, 65, 1, 90, 768, 123, 567, 907, 345, 654};
        int max = num[0];
        int secmax = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                secmax=max;
                max=num[i];

            }else if (num[i] > secmax) {
                secmax = num[i];
            }
        }
        System.out.println("First largest number is " + max);
        System.out.println("Second largest number is " + secmax);
    }
}
