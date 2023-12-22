package review7;

public class Bird {
    /*Protected-you can access me in other package, but only if you extend the class. Not available
    to anybody, only available to child classes.Whichever classes get extended from this protected
    class, can get access. Only child class can access parent class.
     */

 /*Create a Bird class create 4 fields and use the
Bird class as parent class and create 2 classes
Using it one sparrow and one parrot use constructors make fields private and define printInfo
methods as well create the object of each class and call the methods
     */
    private String name;
    private String featherColor;
    private int wings;
    private double weight;

    public void printInfo(){
        System.out.println(name+" "+featherColor+" "+wings+" "+weight);
    }
        Bird(String name, String featherColor, int wings, double weight){
       this.name=name;
       this.featherColor=featherColor;
       this.wings=wings;
       this.weight=wings;
        }
    }
class Sparrow extends Bird{
    Sparrow(String name, String featherColor, int wings, double weight){
        super(name, featherColor, wings, weight);
}}

class Parrot extends Bird {
    Parrot(String name, String featherColor, int wings, double weight) {
        super(name, featherColor, wings, weight);
    }
}

