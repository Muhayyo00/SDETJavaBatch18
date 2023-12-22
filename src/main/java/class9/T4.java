package class9;

public class T4 {
    public static void main(String[] args) {
        /* Create a 2D array of integer type where you will store odd and even numbers
        in 3 rows and 4 columns.Develop a program which will
        identify/print the even numbers only.
         */
        int [][] num={
                {23, 45, 12, 10},
                {67, 65, 20, 80},
                {5, 34, 90, 56}
        };
        for (int i=0; i<num.length;i++) {
              for(int j=0; j<num[i].length; j++) {
               if(num[i][j]%2==0) {
                   System.out.print(num[i][j]+" ");

               }
            }


        }






    }
}
