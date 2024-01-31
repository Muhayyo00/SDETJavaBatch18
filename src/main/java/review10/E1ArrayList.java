package review10;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        /* int=>Integer//int ->datatype, Integer->Wrapper class
        boolean->Boolean//datatype->wrapper class
        double->Double//datatype->wrapper class
         */
        ArrayList <Integer> numbers=new ArrayList<Integer>();//numbers-variable, Arraylist is the datatype of Integer
       numbers.add(10);
       numbers.add(20);
        numbers.add(40);
        numbers.add(30);
        System.out.println(numbers);
        //ArrayList <String> names=new ArrayList<String>();//left side:names is a variable whose datatype is ArrayList of String.right side:we are creating an object of an Arraylist class
        for (int i = 0; i <numbers.size(); i++) {
            System.out.println(numbers.get(i));//gives us individual elements from the ArrayList
        }
        System.out.println("***********************************************");
        for(Integer i:numbers){//we can also say for(int i:numbers)
            System.out.println(i);
            //Integer num=10;//boxing->converting a wrapper class to its datatype
           // int num=num;//boxing-unboxing
        }



    }
}
