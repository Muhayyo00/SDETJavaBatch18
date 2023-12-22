package project1Java;

public class Q1 {
    public static void main(String[] args) {
        /*Create a program that uses an array to store a list of temperatures for a week, and
        then uses a loop to find the highest and lowest temperature for the week.
         */
        int[] temp = {37, 36, 35, 33, 56, 58, 61};//7 elements
        int highest = temp[0];
        int lowest = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i]<lowest) {
                lowest = temp[i];
            }else if (temp[i]>highest) {
                highest = temp[i];
            }
        }
        System.out.println("The highest temperature of the week is "+highest);
        System.out.println("The lowest temperature of the week is "+lowest);

    }
}





