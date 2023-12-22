package class19;

public class Computer {
    /*Create a class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    1)Define common behavior within and some fields in parent class and override
    some of the methods in child classes.
    2)Define some methods specific to child classes
    3)Create objects of child classes and store them into array. Loop through
    each object and execute available methods.
     */

        private String name;
        private double price;
        private int year;
    public void playMusic(){
        System.out.println("Play music...");
    }
    public void switchOn(){
        System.out.println("Switch on");}

    public void switchOff(){
        System.out.println("Switch off");}

    public void compInfo(){
        System.out.println(name+" "+price+" "+year);
    }
    public Computer(String name, double price, int year){
        this.name=name;
        this.price=price;
        this.year=year;
    }}

class Apple extends Computer{
Apple(String name, double price, int year){
    super(name, price, year);
}
@Override
public void playMusic(){
    System.out.println("Play music on Apple");
}}

class Lenovo extends Computer{
Lenovo(String name, double price, int year){
    super(name, price, year);
}
    @Override
    public void playMusic() {
        System.out.println("Play music on Lenovo");}}

class HP extends Computer {
    HP(String name, double price, int year) {
        super(name, price, year);}

    @Override
public void playMusic(){
    System.out.println("Play music on HP");}}

class Dell extends Computer {
        Dell(String name, double price, int year) {
            super(name, price, year);}

        @Override
        public void playMusic() {
            System.out.println("Play music on Dell");}}




