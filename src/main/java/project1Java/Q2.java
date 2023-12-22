package project1Java;

public class Q2 {
    public static void main(String[] args) {
        /* Create an array of integer values. After the array is created, calculate
        the sum of all stored elements in that array.
         */
int [] array={12, 54, 80 ,1, 18, 109, 44, 89, 31, 62 ,10};

int sum=0;
for (int i = 0; i < array.length; i++) {
    sum=sum+array[i];
        }
        System.out.println(sum);

    }
}
