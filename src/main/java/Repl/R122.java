package Repl;

public class R122 {
    private int num;
    private double d;
    private char ch;

    public void printInfo() {
        System.out.println(num);
        System.out.println(d);
        System.out.println(ch);
    }


    public static void main(String[] args) {


        R122 r=new R122();
        r.num=10;
        r.d=10.23;
        r.ch='a';
        r.printInfo();
        R122 r1=new R122();
        r1.num=100;
        r1.d=100.23;
        r1.ch='s';
        r1.printInfo();

    }
}



