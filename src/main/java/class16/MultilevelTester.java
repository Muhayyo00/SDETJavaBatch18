package class16;

public class MultilevelTester {
    public static void main(String[] args) {
        Audi a= new Audi();
        a.color="Black";


    }

}
class Vehicle{
   String color;
}
class Car extends Vehicle{
int noOfDoor=4;
}
class Audi extends Car{
boolean badEngine=true;
}