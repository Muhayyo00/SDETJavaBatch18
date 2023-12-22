package project1Java;

public class Q3 {
    public static void main(String[] args) {
        /* Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the evn numbers only.
         */
        int [][]num={{12, 65, 44, 1, 90, 10},
                {200, 33, 97, 34, 68, 20},
                {36, 11, 86, 43, 61, 24},
                {801, 546, 84, 49, 2}};

            for (int []arr:num) {
                for (int numEven:arr) {
                    if(numEven%2==0) {
                        System.out.print(numEven + " ");
                    }
                }
            }
         }
    }
