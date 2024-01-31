package class22;

import java.util.ArrayList;

public class Task3 {
    /* Create an arrayList of drinks. If any drink has letter "a", or "e",
    replaces the whole word with water
     */
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Monster");
        drinks.add("Milk");
        drinks.add("Champagne");
        drinks.add("Beer");
        drinks.add("Orange Juice");
        for (int i = 0; i < drinks.size(); i++) {
            String d=drinks.get(i);
            if (d.contains("a") || d.contains("e")) {
                drinks.set(i,"Water");
            }
             }
        System.out.println(drinks);


    }

}
