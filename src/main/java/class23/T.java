package class23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class T {
    public static void main(String[] args) {
        //how to remove all the duplicates from ArrayList?
        List<String>aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println("Before removing duplicates: "+aList);
        HashSet<String>aListNoDuplicates=new HashSet<>(aList);
        System.out.println("After removing duplicates: "+aListNoDuplicates);
    }
}
