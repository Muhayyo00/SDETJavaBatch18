package Repl;

public class R148 {

}
class Main{
    String item;
    double price;
    int quantity;
    public double itemTotalPrice(){
        double totalValue=price*quantity;
        System.out.println(item+" Total Value "+totalValue);
        return totalValue;
    }
    public Main(String item, double price, int quantity) {
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }


    public static void main(String[] args) {
        Main b=new Main("Blanket", 99.98, 1);

        Main m=new Main("Mattress",439.18, 1);

        double bTotal=b.itemTotalPrice();
        double mTotal=m.itemTotalPrice();

        double totalPrice=bTotal+mTotal;
        System.out.println("You purchased "+totalPrice+" Today");

    }


}
