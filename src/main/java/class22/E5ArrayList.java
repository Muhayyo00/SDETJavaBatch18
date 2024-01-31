package class22;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {
        ArrayList <String> names=new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");
        //print yes if a name contains letter "o", otherwise, print no for all names
        for (int i = 0; i < names.size(); i++) {
            String s=names.get(i);
            if (s.contains("o")){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }

        for(String s:names){
            if(s.contains("o")){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
