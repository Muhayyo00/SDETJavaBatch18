package review7;

public class T1 {
    /*Create a method which will take an array of ints as input and going to return
     the sum of all the numbers from the input array.*/

    public static void main(String[] args) {
        int[] array = {3, 12, 54, 67};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
