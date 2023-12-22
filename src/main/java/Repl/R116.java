package Repl;

public class R116 {
    void bothEven(int n1, int n2) {
        if((n1%2==0)&&(n2%2==0)) {
                System.out.println("true");
            } else{
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        R116 r=new R116();
        r.bothEven(4, 6);
        r.bothEven(3, 4);
        r.bothEven(-1, 1);
    }
}


