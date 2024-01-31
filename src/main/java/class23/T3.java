package class23;

import java.util.LinkedHashSet;
import java.util.Set;

public class T3 {
    public static void main(String[] args) {
        /*Create a Set of cities in which you want to make sure that insertion order
         is maintained. Then remove any city that starts with “A”;
         */
        Set<String> cities=new LinkedHashSet<>();
        cities.add("Khujand");
        cities.add("Dushanbe");
        cities.add("Khorog");
        cities.add("Isfara");
        cities.add("Astana");
        cities.add("Alma-ata");

        //we do not use enhanced for loop with collection frameworks

        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);



        }
}
