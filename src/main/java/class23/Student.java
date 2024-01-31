package class23;

public class Student {

        /*Create a Set that will hold Objects of Student Type. In this set we do not
        care about the insertion order. Each student object should have name and studentID.
         Display name of each student.
         */
       private String name;
       private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    void printInfo(){
        System.out.println(name);
    }

}
