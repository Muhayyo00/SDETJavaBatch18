package class16;

public class AnimalTester {

    public static void main(String[] args) {
        /* DIAMOND problem-when multiple classes try to inherit from multiple other classes,
        it creates a confusion. When A inherits from M. B also inherits from M. C inherits from
        both A and B. So, a class cannot inherit methods and attributes from several parent
        classes. It is not allowed in Java.
         */

        Dog d=new Dog();
        d.name="Jacky";
        d.color="Black";
        d.age=10;
        d.weight=22;
        d.bark();
        d.printInfo();


        Cat c=new Cat();
        c.name="lulu";
        c.age=2;
        c.weight=3;
        c.sleep();
        c.printInfo();

Animal a =new Animal();
a.sleep();
a.name="lol";

    }
}
