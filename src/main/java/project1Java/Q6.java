package project1Java;

public class Q6 {
    public static void main(String[] args) {
        // Write a java program to check whether a given number is prime or not?

        /*Note: In order to be a prime number, the number should be divisible by 1 and itself. So, number
        13 is divisible by 1 and 13.
         */
        int num=13;
        int count=0;
        for (int i = 1; i <= num; i++) {
            if(num%i==0) {
                count++;
            }
        }
        if(count==2) {
            System.out.println(num+" is a prime number");
        }else{
            System.out.println(num+" is not a prime number");
        }
    }
}
