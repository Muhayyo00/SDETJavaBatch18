package class18;

public class Car {
    /*Car Rental System:
Create a class Car with properties like make, model, and year.
Implement a method calculate_rental_price based on the number of rental days.
Create two subclasses: LuxuryCar and EconomyCar. Override the calculate_rental_price method in LuxuryCar to include additional charges.
Demonstrate the functionality by creating instances of each class and calling their methods
     */
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make=make;
        this.model=model;
        this.year=year;
    }
    public void calRentPrice(int rentDay){
        double rentCost=rentDay*65;
        System.out.println("Renting cost is "+rentCost);
    }}
    class LuxuryCar extends Car {
        public LuxuryCar(String make, String model, int age) {
            super(make, model, age);
        }

        @Override
        public void calRentPrice(int rentDay) {
            double rentCost = rentDay * 65;
            double adCharge = rentDay * 40;
            double totalRentPrice = rentCost + adCharge;
            System.out.println("Renting cost is " + totalRentPrice);
        }}

            class EconomyCar extends Car {
                public EconomyCar(String make, String model, int age) {
                    super(make, model, age);
                }


            }



