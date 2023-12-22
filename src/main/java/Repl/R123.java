package Repl;

public class R123 {
   int values;
    String values1;
    double values2;
    boolean values3;
    float values4;
    public void printInfo(){
        System.out.println(values);
        System.out.println(values1);
        System.out.println(values2);
        System.out.println(values3);
        System.out.println(values4);
    }

    public static void main(String[] args) {
        R123 r=new R123();
        r.printInfo();
    }
}


