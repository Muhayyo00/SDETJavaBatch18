package class19;

public class Product {
    /*E-Commerce System Task: Build a Product class with subclasses like Electronics,
     Clothing, Furniture, and Books.

Define attributes like price, name, and SKU in the Product class.
Override methods such as calculateTax based on product category.
Introduce unique methods like applyWarranty in Electronics.
Create objects of each subclass, store them in an array, and loop through to display
or calculate prices and taxes.
     */

    private String productName;
    private double productPrice;
    private String SKU;
    private double quantity;
    private double taxRate;

    public double calculatePrice(){
        return productPrice*quantity;
    }
    public double calculatePriceWithTax(){
       return calculatePrice()*(1+(taxRate/100));
    }
    public void totalInfo(){
        System.out.println("Your total for the purchase of "+productName+" with tax included is $"+calculatePriceWithTax());
    }

    public Product(String productName,double productPrice, String SKU, double quantity, double taxRate) {

        this.productName = productName;
        this.productPrice = productPrice;
        this.SKU = SKU;
        this.quantity = quantity;
        this.taxRate = taxRate;
    }
}
class Electronics extends Product{
    private double warranty;
    Electronics(String productName,double productPrice, String SKU, double quantity, double taxRate, double warranty){
        super(productName,productPrice,SKU,quantity,taxRate);
        this.warranty=warranty;
    }
public double applyWarranty(){
return calculatePriceWithTax()+warranty;
}
}
class Clothing extends Product{
    Clothing(String productName,double productPrice, String SKU, double quantity, double taxRate){
        super(productName,productPrice,SKU,quantity,taxRate);
    }
}
class Furniture extends Product{
Furniture(String productName,double productPrice, String SKU, double quantity, double taxRate){
    super(productName,productPrice,SKU,quantity,taxRate);
}
}
class Books extends Product{
Books(String productName,double productPrice, String SKU, double quantity, double taxRate){
    super(productName,productPrice,SKU,quantity,taxRate);
}
}
