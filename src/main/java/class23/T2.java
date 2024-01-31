package class23;

import java.util.Set;
import java.util.TreeSet;

public class T2 {
    public static void main(String[] args) {
        /*Create a Set in which you need to add names of the countries(5).
        In this set we want all objects to be sorted in alphabetical order.
        retrieve all elements from set.
         */
        Set<String>countries=new TreeSet<>();
        countries.add("Tajikistan");
        countries.add("Uzbekistan");
        countries.add("Turkmenistan");
        countries.add("Kyrgyzstan");
        countries.add("Kazakhstan");
        System.out.println(countries);
        for(String s:countries){
            System.out.print(s+" ");
        }




    }
}
