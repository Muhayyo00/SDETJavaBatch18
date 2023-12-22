package class9;

public class T2 {
    public static void main(String[] args) {
        int [] [] matrix={
                {10, 20, 50},
                {25, 35, 66},
                {80, 90, 78, 45},
                {45, 55, 66}
        };
        //add the sum of each of the row separately and print them

        for(int row=0; row<matrix.length;row++) {
            int sum=0;
           for (int col=0;col<matrix[row].length;col++) {
               sum=sum+matrix[row][col];
           }

            System.out.println("The sum of the row "+(row+1)+" is "+sum);
            }

        }




    }

