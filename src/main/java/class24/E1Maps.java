package class24;

import java.util.HashMap;

public class E1Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> maps=new HashMap<>();
        //Map-interface-->You can also say HashMap
        //Map<String, Integer> fruit=new HashMap<>();
        maps.put("Banana",20);
        maps.put("Apple",15);
        maps.put("Kiwi",5);
        maps.put("Orange",20);
        //duplicate keys are not allowed if we try it will replace previous value
        System.out.println(maps);//{Apple=15, Kiwi=5, Orange=20, Banana=20}
        System.out.println(maps.size());//prints 4
        System.out.println(maps.containsKey("Apple".toLowerCase()));//false
        System.out.println(maps.containsKey("Legs"));
        System.out.println(maps.containsValue(25));//false
        System.out.println(maps.containsValue(5));//true
        System.out.println(maps.isEmpty());//false
        System.out.println(maps.get("Kiwi"));//prints 5
    }
}
