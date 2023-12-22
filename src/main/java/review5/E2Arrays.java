package review5;

public class E2Arrays {
    public static void main(String[] args) {
        //creating the array and initializing it
        int [] numbers={10, 25, 36, 56, 80};
        System.out.println(numbers.length);
        System.out.println(numbers[2]);
        for(int i=0; i<numbers.length;i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        for(int n:numbers) {
            System.out.print(n+" ");
        }
    }
}
