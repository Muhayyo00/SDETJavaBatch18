package class23;

import java.util.LinkedList;

public class E2LinkedList {
    public static void main(String[] args) {
        LinkedList <String>names=new LinkedList<>();
        names.add("Kat");
        names.add("Kit");
        names.add("Kut");
        names.add("Kot");
        names.add("Kyt");
        names.remove(0);
        System.out.println(names);
        System.out.println(names.size());

    }
}
