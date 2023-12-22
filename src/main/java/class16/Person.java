package class16;

public class Person {
    String name;
    int age;
    double weight;
    void printInfo(){
        System.out.println(name+" "+age+" "+weight);
    }}

class Student extends Person {
    char grade;

    void study() {
        System.out.println("lalala");
    }}

class StudentTester{
    public static void main(String[] args) {
        Student s=new Student();
        s.age=12;
        s.name="Anusha";
        s.weight=23;
        s.printInfo();
        s.study();
    }
}