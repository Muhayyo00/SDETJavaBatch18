package class22;

import java.util.ArrayList;
public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Maria");
        names.add("Patrick");
        names.add("Damla");
        names.add("Michelle");
        names.add("Kamila");
        for (int i = 0; i < names.size(); i++) {//in ArrayList we use .size(), NOT .length like with Array
           // System.out.println(names.get(i)); //prints all the elements in ArrayList
            //System.out.println(names.get(i).length());//shows the length of each element, Maria=5
            String s=names.get(i);
            System.out.println(s.length());//shows the length of each element in arraylist
        }
        System.out.println("****************************");
        for (String n:names){
        System.out.println(n);//prints all the elements of the arraylist using an enhanced loop
        }
    }
}
