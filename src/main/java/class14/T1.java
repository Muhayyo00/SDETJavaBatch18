package class14;

public class T1 {
    /* Create a method that will accept an array as parameters and will return a sum of
    all elements from that array. Method should be visible only within that same package
    and accessible by creating an instance/object of the class.
     */

    int sumArray(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        T1 t=new T1();
        int[] arr={10, 20, 10};
        int sum=t.sumArray(arr);
        System.out.println(sum);

    }


}