package class24;

import java.util.Map;
import java.util.TreeMap;

public class T5 {
    public static void main(String[] args) {
        Map<String, String> countries=new TreeMap<>();
        countries.put("Tajikistan","Dushanbe");
        countries.put("Poland", "Warsaw");
        countries.put("Uzbekistan", "Tashkent");
        countries.put("Kazakhstan", "Astana");
        System.out.println("Countries and capitals: ");
        countries.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("******************************");
        System.out.println("Capitals only: ");
        countries.forEach((k,v)-> System.out.println(v));

    }
}
