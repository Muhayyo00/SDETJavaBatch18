package class22;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        /* Create an arrayList of even numbers from 1 to 500 using a loop. Then write another
        loop to remove any number that is divisible by 5 from that arrayList
         */
        ArrayList<Integer>even=new ArrayList<>();
        for (int i = 2; i<=500; i=i+2) {
        even.add(i);}

        for (int i=even.size()-1; i>=0; i--) {
         if(even.get(i)%5==0){
             even.remove(i);}}

        System.out.println(even);
}



}
