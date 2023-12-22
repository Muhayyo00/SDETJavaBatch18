package class9;

public class E2Arrays {
    public static void main(String[] args) {
        int [] [] matrix={
                {10, 20, 50},
                {25, 35, 66},
                {80, 90, 78, 45},
                {45, 55, 66}
        };
        System.out.println(matrix [1][1]);//35
        System.out.println(matrix [0][2]);//50
        //System.out.println(matrix [4][2]);//error, there is no row 4
        System.out.println(matrix [3][2]);//66
        //System.out.println(matrix [0][3]);//error, there is no element/column 3 in row 0


        System.out.println(matrix.length);//tells how many rows, here-4 rows
        System.out.println(matrix[0].length);//number of elements on row 0-->10, 20, 50 (3 elements)
        System.out.println(matrix[2].length);//4 elements on row 2-->80, 90, 78, 45
    }
}
