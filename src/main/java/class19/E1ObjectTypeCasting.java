package class19;

public class E1ObjectTypeCasting {
    public static void main(String[] args) {
        int number=10;
        double num=number;
        System.out.println(num);//prints 10.0

        //double num2=10.5;
        //int num3=num2;
        /*get error because double is greater than int datatype.We can loose some piece
        of information when converting bigger datatype to smaller.
         */
        double num2=10.5;
        int num3=(int)num2;
        System.out.println(num3);//prints 10. We loose 0.5 while converting.

    }
}
