package Repl;

public class R117 {
    void SumEvenTox(int x) {
        int sum=0;

        for (int i = 1; i <=x; i++) {
            if(x%2==0) {
                sum+= x;
            }

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        R117 r=new R117();
        r.SumEvenTox(6);
        r.SumEvenTox(20);

    }
}
