package class9;

public class E3Arrays {
    public static void main(String[] args) {
        int [] [] matrix={
                {10, 20, 50},
                {25, 35, 66},
                {80, 90, 78, 45},
                {45, 55, 66}
        };
        int [] row0=matrix[0];//entire row [0]-->10, 20, 50
        System.out.println(row0[0]);//10
        System.out.println(row0[2]);//50

        int [] row=matrix[2];//entire row [2]-->80, 90, 78, 45
        //System.out.println(row[2]);//78--> row 2, element at index 2
        for(int i=0;i<row.length; i++) {
            System.out.print(row[i]+" ");
        }



    }
}
