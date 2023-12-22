package class6;

public class T9 {
    public static void main(String[] args) {
        //Print odd numbers between 20 and 50 (using 2 different methods)

        for(int i=19; i<=50; i+=2) {
            System.out.print(i+" ");
        }

        int x=19;
        while(x<=50) {
            System.out.println(x+" ");
            x+=2;
        }
    }
}
