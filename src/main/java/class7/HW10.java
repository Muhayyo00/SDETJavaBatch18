package class7;

public class HW10 {
    public static void main(String[] args) {
        //Create an array to store char values and then print those in reverse order

        char [] num={'a', 'b', 'c', 'd', 'e', 'f'};
        for (int i=num.length-1; i>=0; i--) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}
