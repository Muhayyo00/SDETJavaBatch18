package class22;

import java.util.ArrayList;
import java.util.Arrays;

public class E2ArrayList {
    public static void main(String[] args) {
        /* This is called generic ArrayList. People would put heterogeneous datatype inside
        same ArrayList. Now, you use angle brackets and put only homogenous datatype.
        ArrayList names=new ArrayList();
        names.add(12);
        names.add("Engine");
        names.add(true);
        */
        ArrayList <String> names=new ArrayList<>();//we are not specifying size of array anywhere.
        System.out.println(names.size());//prints 0, because the array is empty
        names.add("Bikal");
        System.out.println(names.size());//prints 1, because there is "Bikal".
       // names.remove(""); --> removes "Bikal" and shows 0 again.
        System.out.println(names.contains("Bikal"));//prints true, because there is "Bikal" inside the array
       String [] students=new String[100];
        System.out.println(students.length);//shows 100
        System.out.println(Arrays.toString(students));//if we add nothing and print, it will print 100 nulls no matter if we used or 100 space or not, it will still create 100 spaces.




    }
}
