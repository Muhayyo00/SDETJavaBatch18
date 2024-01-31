package class21;

public abstract class Vehicle {
    /*)Vehicle Management System: Design a base class Vehicle with methods like startEngine(),
     stopEngine(), fuelUp(), and fields like make, model, and fuelLevel. Create subclasses like
      Car, Truck, and Motorcycle, each with specific implementations for the methods, considering
       their unique characteristics.
     */
    private String make;
    private String model;
    private int fuelLevel;

    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void fuelUp();
    public void vehicleInfo(){
        System.out.println(make+" "+model+" "+fuelLevel);
    }
   public Vehicle(String make, String model, int fuelLevel){
        this.make=make;
        this.model=model;
        this.fuelLevel=fuelLevel;}}

class Car extends Vehicle{
    Car(String make, String model, int fuelLevel){
        super(make, model, fuelLevel);}

    @Override
    public void startEngine() {
        System.out.println("The car engine is started");
    }

    @Override
    public void stopEngine() {
        System.out.println("The car engine is stopped");
    }

    @Override
    public void fuelUp() {
        System.out.println("The fuel of the car goes up up up");
    }
}
class Truck extends Vehicle{
Truck(String make, String model, int fuelLevel){
    super(make, model, fuelLevel);}
    @Override
    public void startEngine() {
        System.out.println("The truck engine is started");
    }

    @Override
    public void stopEngine() {
        System.out.println("The truck engine is stopped");
    }

    @Override
    public void fuelUp() {
        System.out.println("The fuel of the truck is up up up");
    }
}
class Motorcycle extends Vehicle{
    Motorcycle(String make, String model, int fuelLevel){
        super(make, model, fuelLevel);}
    public void startEngine() {
        System.out.println("The motorcycle engine is started");
    }

    @Override
    public void stopEngine() {
        System.out.println("The motorcycle engine is stopped");
    }

    @Override
    public void fuelUp() {
        System.out.println("The motorcycle fuel wen up up up");
    }

    public static void main(String[] args) {
        Vehicle[]arr={new Car("Ford", "Bronco Sport",40 ), new Truck("GMC","Sierra 1500 SLE", 80 ), new Motorcycle("Kawasaki", "WE 1250cc",20)};
    for(Vehicle v:arr){
        v.startEngine();
        v.stopEngine();
        v.fuelUp();
        v.vehicleInfo();
        System.out.println("___________________________________________________________________________");
    }


    }




}
