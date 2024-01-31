package class14;

public class E1LocalVar {
    public static void main(String[] args) {
        //local variables can be only accessed within the method's (block of code) curly brackets.
        int age=10;
        if(10<5) {
            System.out.println(age);//nothing is printed, because the condition is false
        }

    }


}
