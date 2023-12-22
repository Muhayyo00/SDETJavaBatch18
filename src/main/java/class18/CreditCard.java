package class18;

public class CreditCard {
    /*Create a class CreditCard Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */
    private double amount;
    private double interest;
    public void calCul(double amount){
        double interest=amount*0.05;
        System.out.println("Interest on "+amount+" is "+interest);
    }
}
class Visa extends CreditCard{
    @Override
    public void calCul(double amount) {
        double interest=amount*0.07;
        System.out.println("Interest on "+amount+" is "+interest);
    }
}
class AX extends CreditCard{
    @Override
    public void calCul(double amount) {
        double interest=amount*0.09;
        System.out.println("Interest on "+amount+" is "+interest);
    }
}
class CreditTester{
    public static void main(String[] args) {
        AX ax=new AX();
        ax.calCul(100);
       Visa visa=new Visa();
        visa.calCul(100);
    }
}
