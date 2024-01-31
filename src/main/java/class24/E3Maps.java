package class24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class E3Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> maps=new HashMap<>();
        maps.put("Banana",20);
        maps.put("Apple",15);
        maps.put("Kiwi",5);
        maps.put("Orange",25);
        System.out.println(maps);
        System.out.println(maps.keySet());//prints only keys-->[Apple, Kiwi, Orange, Banana]
        System.out.println(maps.values());//prints only values-->[15, 5, 25, 20]
        //returns the keys in the form of a set
        Set<String>keys=maps.keySet();
        ArrayList<String> arraylist=new ArrayList<>(keys);
        for(String k:keys){
            System.out.println(k);
        }//Apple, Kiwi, Orange, Banana




    }
}
