package Repl;

public class R079 {
    public static void main(String[] args) {
       double [][] values={{1.4,2.0,3.3,2.0},
               {4.0,1.5,6.1,1.0},
               {1.2,3.1,4.0,1.6}};
       for (double[] arr:values) {
           for(double x:arr) {
               System.out.print(x+" ");
           }
           System.out.println();
       }
    }
}
