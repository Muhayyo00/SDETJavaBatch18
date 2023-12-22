package Repl;

public class R081 {
    public static void main(String[] args) {
int []a={5, 4, 8};
         int highest=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>highest){
            highest=a[i];

            }

        }
        System.out.println(highest);

    }
}
