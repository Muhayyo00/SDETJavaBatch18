package class22;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        //ArrayList is fast but takes 4x more space than Array
        names.add("Maria");
        names.add("Patrick");
        names.add("Damla");
        names.add("Michelle");
        names.add("Kamila");
        //Methods of ArrayList
        System.out.println(names.size());//prints 5
        System.out.println(names.contains("Damla"));//prints true
        System.out.println(names.contains("Muhayyo"));//prints false
        System.out.println(names.remove("Kamila"));//removes Kamila from array
        System.out.println(names.remove(3));//removes Kamila based on index
        System.out.println(names.get(0));//prints the element at index 0=Maria
        names.set(0,"Nasima");//changes the name at index 0 to "Nasima"
        System.out.println(names);//prints [Nasima, Patrick, Damla]
        System.out.println(names.indexOf("Damla"));//prints the index of element Damla = index 2
        System.out.println(names.indexOf("Carlos"));//prints -1, because there is no Carlos in an array





    }
}
