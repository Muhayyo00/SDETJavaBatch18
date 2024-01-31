package class22;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        /*Create an arrayList of words.Remove every word that ends with "e"*/
        ArrayList <String> words=new ArrayList<>();
        words.add("Omina");
        words.add("Sitora");
        words.add("Mohira");
        words.add("Mahliye");
        words.add("Sitore");

        words.removeIf(x->x.contains("e"));
        System.out.println(words);
    }
}
