package class18;

public class CarTester {
    public static void main(String[] args) {
        Car car= new Car("Toyota", "Highlander", 2019);
        car.calRentPrice(30);
        LuxuryCar luxury=new LuxuryCar("Kia", "Telluride", 2022);
        luxury.calRentPrice(30);
        EconomyCar economy=new EconomyCar("Lexus", "Prius", 2010);
        economy.calRentPrice(30);
    }
}
