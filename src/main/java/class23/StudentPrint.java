package class23;

import java.util.HashSet;

public class StudentPrint {
    public static void main(String[] args) {
        HashSet<Student>students=new HashSet<>();
       students.add(new Student("Engin", "123"));
        students.add(new Student("Kat", "345"));
        students.add(new Student("Nasima", "567"));
        students.add(new Student("Maria", "891"));
        for(Student s:students){
            s.printInfo();
        }

    }
}
