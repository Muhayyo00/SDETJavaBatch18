package class24;

import java.util.LinkedHashMap;
import java.util.Map;

public class T1 {
    public static void main(String[] args) {
        /*Create a map of a building. Store floor number and its associated company name.
        (Example:1=Google, 2=Syntax etc...) Insert 7 entries with duplicate keys and values.
        * Check how many entries you have?
        *Update company on a 4th floor?
        * Remove company on the 7th floor
        * Print your map
         */
        Map<Integer, String> company=new LinkedHashMap<>();
        company.put(1, "Google");
        company.put(2, "Syntax");
        company.put(3, "Amazon");
        company.put(4, "Ali-Express");
        company.put(5, "Ebay");
        company.put(6, "Best-Buy");
        company.put(7,"Ross");
        System.out.println(company);
        System.out.println(company.size());
        company.replace(4, "Arkon");//replace replaces only if that is already present in an array
        company.remove(7);
        System.out.println(company);



    }
}
