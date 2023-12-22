package class9;

public class HW2 {
    public static void main(String[] args) {
        /*
         Create a 2D array of integer type where you will store odd and even numbers
        in 3 rows and 4 columns.Develop a program which will
        identify/print the even numbers only.
         */
        int [][] num= {  {12, 65, 37, 44},
                         {89, 90, 60, 10},
                         {101, 88, 42, 39}
                       };
        for(int i=0; i<num.length;i++) {
            for(int j=0; j<num[i].length;j++) {
                if(num[i][j]%2==0) {
                    System.out.print(num[i][j]+" ");
                }
                 }
        }
        System.out.println();

        System.out.println("Second Way: Enhanced For Loop");

       for(int []arr:num) {
        for(int x:arr) {
            if(x%2==0) {
                System.out.print(x+" ");
            }

            }
        }
    }
}
