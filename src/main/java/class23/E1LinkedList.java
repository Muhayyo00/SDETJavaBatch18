package class23;

import class10.Dog;

import java.util.LinkedList;

public class E1LinkedList {
    public static void main(String[] args) {
        //inside the <> we write the name of the class, whose objects we want to store
        LinkedList<Dog> dogs=new LinkedList<Dog>();
        Dog d1=new Dog();
        dogs.add(d1);


    }
}