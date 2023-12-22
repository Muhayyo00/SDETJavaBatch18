package class19;

public class Student {
    /*Create a class Student that will have 3 subclasses, such as SyntaxStudent,
    CollegeStudent and SchoolStudent.
    1)Define 3 common behavior within parent class and override some fo the methods
    in child classes.
    2)Define some methods specific to child classes
    3)Write example of achieving run time polymorphism
     */
    void study(){
        System.out.println("Study hard...");
    }
    void getScholarship(){
        System.out.println("Scholarships decrease or cover your tuition...");
    }
    void doHW(){
        System.out.println("Do Home Works...");
    }
}
class SyntaxStudent extends Student{
    void getScholarship(){
        System.out.println("No scholarships...");
    }
    void skipClass(){
        System.out.println("No skipping! You need to work hard and do all your Home Works on time");
    }
}
class CollegeStudent extends Student{
    void getScholarship(){
        System.out.println("You qualify for a Scholarship through low-income or outstanding academic achievements...");
    }
    void getGrades(){
        System.out.println("You need to study hard to stay qualified for the Scholarship");
    }
}
class SchoolStudent extends Student {


    public static void main(String[] args) {
        Student[] arr={new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (int i = 0; i < arr.length; i++) {
           arr[i].study();
           arr[i].doHW();
           arr[i].getScholarship();


        }
    }
}