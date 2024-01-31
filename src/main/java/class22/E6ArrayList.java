package class22;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");
        for (int i = 0; i < names.size(); i++) {
            String s=names.get(i);
            if(s.contains("o")){//set method is similar to replace method
                names.set(i,"Java");//we replaced a name containing letter "o" with Java
            }
        }
        System.out.println(names);
    }
}
