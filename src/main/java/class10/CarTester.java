package class10;

public class CarTester {
    public static void main(String[] args) {
        //Create an object from the class
        Car bmw=new Car();
        bmw.model="I7";
        bmw.make="BMW";
        bmw.color="White";
        bmw.price=120000;

        System.out.println(bmw.model);
        System.out.println(bmw.make);
        System.out.println(bmw.color);
        System.out.println(bmw.price);
        bmw.drive();
        bmw.honk();
        bmw.ApplyBrake();

    }



}
