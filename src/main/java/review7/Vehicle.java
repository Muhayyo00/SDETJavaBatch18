package review7;

public class Vehicle {
    /* Create a class named Vehicle. If no arguments are passed while creating an object of
    the class, it should print "I love vehicles". If a String representing the type of vehicle
    (like "Car", "Bike") is passed, it should print "I love [VehicleType]". For example,
    if "Car" is passed, it should print "I love Car"
     */
    Vehicle(){
        System.out.println("I love vehicles");
    }
    Vehicle(String VehicleType) {
        System.out.println("I love "+VehicleType);
    }
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        new Vehicle("Toyota");

    }
}
