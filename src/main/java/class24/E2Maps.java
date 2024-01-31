package class24;

import java.util.HashMap;

public class E2Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> maps=new HashMap<>();
        maps.put("Banana",20);
        maps.put("Apple",15);
        maps.put("Kiwi",5);
        maps.put("Orange",25);
        System.out.println(maps);//{Apple=15, Kiwi=5, Orange=25, Banana=20}
        maps.remove("Kiwi");
        System.out.println(maps);//{Apple=15, Orange=25, Banana=20}
        maps.replace("Apple", 30);//{Apple=30, Orange=25, Banana=20}-->update Apple 20 to 30
        System.out.println(maps);
        maps.clear();
        System.out.println(maps);//{} empties the whole map

    }
}
