package class19;

public class E2Poly {
    public static void main(String[] args) {
        Dog d1=new Dog("Jacky", "Brown", 10, 25);
        Dog d2=new Dog("Ricky", "Black", 10, 25);
        Cat c1=new Cat("Lolo", "White", 1, 12);
        Animal a1=new Animal("Animal", "White", 1, 12);

        //Dog [] arr={d1, d2};//stores only dogs
        Animal [] arr={d1, d2, c1, a1};//can store all the animals.
        //Dog a2=(Dog)arr[0];//if we want to choose child class, we downsize by adding (Dog)
        Animal a2=arr[0];//will call the item in index 0, which is Dog1.
        a2.printInfo();//Prints Jacky, Brown, 10, 25.
    }
    }

