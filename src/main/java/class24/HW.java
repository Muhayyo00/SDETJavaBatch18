package class24;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HW {
    public static void main(String[] args) {
       /* Create a map of Best Buy store. Place
        item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        Retrieve all keys and values from a Best Buy map using EntrySet.*/
        Map<Integer, String> bestBuy=new HashMap<>();
        bestBuy.put(232435, "TV");
        bestBuy.put(233455,"Laptop");
        bestBuy.put(234556,"Printer");
        bestBuy.put(566789,"Headset");
        bestBuy.put(788987,"Refrigerator");
        Set<Map.Entry<Integer, String>>entries=bestBuy.entrySet();
        for(Map.Entry<Integer, String> b:entries){
            System.out.println(b);
        }



    }
}
