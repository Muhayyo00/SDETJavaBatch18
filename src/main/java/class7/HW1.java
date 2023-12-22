package class7;
public class HW1 {
    public static void main(String[] args) {
        /* Create an array of chars and store grades into it:A, B, C, D. Then , print
        a grade B (use 2 different ways of creating an array)
        */

        char [] grades={'A', 'B', 'C', 'D'};//1st way
        System.out.print("Print "+grades[1]);
        System.out.println();
        //2nd way

        grades [0]= 'A';
        grades [1]='B';
        grades [2]='C';
        grades [3]='D';
        System.out.println("Print "+grades[1]);

    }
}






