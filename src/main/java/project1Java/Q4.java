package project1Java;

public class Q4 {
    public static void main(String[] args) {
        /* Create a 2D array of integers.Develop a program which will calculate the
        sum of even and odd numbers for that array.
         */
        int [][]num={{12, 68, 44, 13, 90, 10},
                {200, 33, 97, 34, 98, 20},
                {36, 11, 39, 43, 61, 24},
                {801, 546, 84, 46, 21}};
        int sumEven=0;
        int sumOdd=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if(num[i][j]%2==0) {
                    sumEven=sumEven+num[i][j];
                }else{
                    sumOdd=sumOdd+num[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers is: "+sumEven);
        System.out.println("The sum of odd numbers is "+sumOdd);

    }
}
