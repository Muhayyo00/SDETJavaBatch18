package class14;

public class Students {
    /*Create a Class called Students
    1)Create three variables Name, ID and numberOfStudents
    2)Create three objects of the Students class
    3) Set the value for the studentName, studentID and increment the
    numberOfStudents for each object
    4) Print out total number of students
     */

    String studentName;
    int studentID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students noOne=new Students();
        noOne.studentName="Amid";
        noOne.studentID=12344;
        System.out.println(noOne.studentName);
        System.out.println(noOne.studentID);
        Students.numberOfStudents++;

        Students noTwo=new Students();
        noTwo.studentName="Omar";
        noTwo.studentID=19844;
        System.out.println(noTwo.studentName);
        System.out.println(noTwo.studentID);
        Students.numberOfStudents++;

        Students noThree=new Students();
        noThree.studentName="Muhayyo";
        noThree.studentID=12964;
        System.out.println(noThree.studentName);
        System.out.println(noThree.studentID);
        Students.numberOfStudents++;
        System.out.println("Number of students is "+numberOfStudents);






    }
}
