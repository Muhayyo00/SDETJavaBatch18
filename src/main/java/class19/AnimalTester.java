package class19;

public class AnimalTester {
    public static void main(String[] args) {
        Animal a=new Dog("Jacky", "Black", 1, 12);
    Dog d=(Dog)a;
    d.bark();
    double[]arr={10, 20};
    /*When we want to store the object of a class, we can store it inside
    parent class or class itself. The datatype of the variable can be the class itself or the parent
    class. This is good when we store one object. When we want to store multiple
    objects, we create an array[].
     */

    Dog d1=new Dog("Jacky", "Black", 1, 12);
    Dog d2=new Dog("Macky", "Black", 1, 12);
    Cat c1=new Cat("Lolo", "White", 1, 12);
    Animal a1=new Animal("Animal", "White", 1, 12);

    //Dog [] arr={d1, d2};//stores only dogs
    Animal [] animals={d1, d2, c1, a1};//can store all the animals

    }
}
