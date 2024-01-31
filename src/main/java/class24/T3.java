package class24;

import java.util.HashMap;
import java.util.Map;

public class T3 {
    public static void main(String[] args) {

        Map<String, Integer> maps=new HashMap<>();
        maps.put("Banana",20);
        maps.put("Apple",15);
        maps.put("Kiwi",5);
        maps.put("Orange",25);
        maps.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("*******************************");
        maps.forEach((k,v)-> {
            if(k.contains("A")||v>10){
                System.out.println(k+" "+v);}
                }
        );


    }
}
