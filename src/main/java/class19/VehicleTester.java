package class19;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle[]arr={new Car(100, "white","Gasoline"), new Truck(120,"Silver", "Diesel"),new Motorcycle(110, "Red", "Gasoline"),new Bicycle(50,"Black", "No Fuel Needed")};
    for (Vehicle v:arr){
        v.vehicleInfo();
        v.accelerate();
        v.goesBroken();


        }
    }
}
