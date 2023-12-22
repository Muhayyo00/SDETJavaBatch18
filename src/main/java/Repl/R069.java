package Repl;

public class R069 {
    public static void main(String[] args) {
int num=7;
        for (int i=1; i<=num; i++) {
            int p=1;
            for (int x=i; x<=num; x++) {
                System.out.print(p+++" ");
            }
            System.out.println();
        }
    }
}
