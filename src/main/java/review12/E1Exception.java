package review12;

public class E1Exception {
    public static void main(String[] args) {
        // int=10; Java wants us to name a variable
       // int number=10;//is a correct way
        int number=10;
        System.out.println(1);
        System.out.println(2);
        try{
            int [] arr=new int[2];
            arr[5]=10;
        }

        catch (ArrayIndexOutOfBoundsException a){
            a.printStackTrace();
            //  System.out.println(a);
            // System.out.println(a.getMessage());
        }
        System.out.println(3);


    }

}
