package class7;

public class E12Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 45, 69, 55, 45, 20, 56, 78, 90};
        System.out.println(numbers.length);//tells us how many numbers/items we have inside {}

        for (int i = 0; i < numbers.length; i++) {//prints all the items of the array
            System.out.print(numbers[i] + " ");
        }
    }
}
