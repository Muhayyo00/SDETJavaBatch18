package class19;

public class Vehicle {
/*Vehicle Hierarchy Task: Create a class Vehicle with subclasses like Car, Truck,
  Motorcycle, and Bicycle.
Define common attributes like speed, color, and fuelType in the Vehicle class.
Override methods in the subclasses, like accelerate and brake, with specific behaviors.
Add unique methods in subclasses, like loadCargo in Truck.
Instantiate objects of each subclass and store them in an array. Iterate through the array to
demonstrate polymorphism.
    */
    private double speed;
    private String color;
    private String fuelType;

    public void vehicleInfo(){
        System.out.println(speed+" "+color+" "+fuelType);
    }
    public void accelerate(){
        System.out.println("The vehicle accelerates");
    }
    public void goesBroken(){
        System.out.println("The vehicle breaks...");
    }

    public Vehicle(double speed, String color, String fuelType) {
        this.speed = speed;
        this.color = color;
        this.fuelType = fuelType;}}

class Car extends Vehicle{
Car(double speed, String color, String fuelType){
    super(speed, color, fuelType);}
@Override
    public void accelerate(){
        System.out.println("The car accelerates");}}

class Truck extends Vehicle{
    Truck(double speed, String color, String fuelType){
    super(speed, color, fuelType);}
@Override
public void accelerate(){
    System.out.println("The truck accelerates");}
public void loadCargo(){
    System.out.println("The cargo is loaded...");}}

class Motorcycle extends Vehicle{
Motorcycle(double speed, String color, String fuelType){
    super(speed, color, fuelType);}
@Override
public void accelerate(){
    System.out.println("The motorcycle accelerates abruptly");}}

class Bicycle extends Vehicle{
Bicycle(double speed, String color, String fuelType){
    super(speed, color, fuelType);}
@Override
    public void accelerate(){
        System.out.println("The bicycle accelerates, but gradually");}}
