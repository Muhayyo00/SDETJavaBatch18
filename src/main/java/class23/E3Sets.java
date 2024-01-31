package class23;

import java.util.ArrayList;
import java.util.HashSet;

public class E3Sets {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();//prints elements in order
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);
       HashSet<Integer> num=new HashSet<>();//prints elements randomly
        num.add(10);
        num.add(20);
        num.add(10);
        System.out.println(num);
    }
}
