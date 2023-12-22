package class6;

public class E4Loop {
    public static void main(String[] args) {
        int x=1;
        while(x<=5) {
            if(x!=2) {//first instruction is if statement. If it is true, print statement is executed
                //1, 3, 4, 5 will be executed.but NOT 2.
                System.out.println(x);
            }
            x++;//increments the value of the x by one every time it is executed.
        }
    }
}
