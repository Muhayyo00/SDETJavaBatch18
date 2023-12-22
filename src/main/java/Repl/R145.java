package Repl;

public class R145 {
}
class Car{
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;
    public void display(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }
Car(String make, String model, int numberOfDoors, int topSpeed, double price){
this.make=make;
this.model=model;
this.numberOfDoors=numberOfDoors;
this.topSpeed=topSpeed;
this.price=price;
}
Car(String make, String model, int topSpeed, double price){
    this.make=make;
    this.model=model;
    this.topSpeed=topSpeed;
    this.price=price;
}
Car(int numberOfDoors, int topSpeed, double price){
    this.make="unknown";
    this.model="unknown";
    this.numberOfDoors=numberOfDoors;
    this.topSpeed=topSpeed;
    this.price=price;
}
Car(String make, String model, int numberOfDoors){

    this.make=make;
    this.model=model;
    this.numberOfDoors=numberOfDoors;
    this.topSpeed=90;
    this.price=0;

}

    public static void main(String[] args) {
        Car c=new Car("Toyota", "Prius", 4, 120, 30000);
        c.display();
        Car c1=new Car("Toyota", "Prius", 4,120, 30000);
        c1.display();
        Car c2=new Car(4, 120, 30000);
        c2.display();
        Car c3=new Car("Toyota", "Prius", 4);
        c3.display();
    }
}