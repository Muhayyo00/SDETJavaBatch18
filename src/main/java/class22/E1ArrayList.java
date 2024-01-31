package class22;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        ArrayList <String> names=new ArrayList<>();//syntax to create an object of ArrayList class. <> is called generics
        names.add("Maria");
        System.out.println(names.size());//size of array is 1
        names.add("Patrick");
        names.add("Damla");
        names.add("Michelle");
        names.add("Kamila");
        System.out.println(names.size());//size of array is 5
        System.out.println(names);

    }
}
