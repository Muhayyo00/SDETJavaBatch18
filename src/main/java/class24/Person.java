package class24;

import java.util.Map;
import java.util.TreeMap;

public class Person {
    /*Create a Person class with following private fields: name, lastName, age, salary.
    Variables should be initialized through constructor.
    Inside the class also create a method to print user details.*/
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
   public void printInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }

    public static void main(String[] args) {
        Map<Integer, Person>person=new TreeMap <>();
        person.put(1, new Person("Asghar", "Nazir", 24, 250000));
        person.put(2, new Person("Moazzam", "Sadiq", 24, 20000));
        person.put(3, new Person("Asal", "Umurzakova", 22, 30000));

        person.forEach((k,v)-> {System.out.println("ID: "+k);
        v.printInfo();});
//k=key,v=object of Person class
}}
