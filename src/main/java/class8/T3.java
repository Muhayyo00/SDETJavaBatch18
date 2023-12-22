package class8;

public class T3 {
    public static void main(String[] args) {
        int [] numbers={10, 15, 20, 18, 9, 60, 22, 30};
        //show the sum of even numbers and odd numbers separately
int sumOdd=0;
int sumEven=0;
       int nOdd=0;
       int nEven=0;
       for(int x:numbers) {
           if(x%2==0) {
               sumEven=sumEven+x;
           }
           if(x%2!=0) {
               sumOdd=sumOdd+x;
           }
        }
        System.out.println("Sum of even numbers is "+sumEven);
        System.out.println("Sum of odd numbers is "+sumOdd);
    }
}
