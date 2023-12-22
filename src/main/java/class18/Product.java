package class18;

public class Product {
    /*Online Shopping Cart:
Construct a class Product with attributes like product_name, price, and quantity. Create a subclass
DiscountedProduct that extends Product and includes an additional discount_rate attribute.
Override a method in DiscountedProduct to calculate the price after applying the discount.
Create instances of both classes and show how prices are calculated
     */
    String productName;
    double price;
    double quantity;

    Product(String productName, double price, double quantity) {
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
        }
        public double calPrice(){

            return price*quantity;
        }
        public void displayPrice(){
        double regularPrice=calPrice();
            System.out.println("Regular price is "+regularPrice);
        }
    }
    class DiscountedProduct extends Product{
    private double discountRate;
    public DiscountedProduct(String name, double price, double quantity, double discountRate){
        super(name, price, quantity);
        this.discountRate=discountRate;
    }
    @Override
        public void displayPrice(){
        double regularPrice=calPrice();
        double discountPrice=regularPrice-((regularPrice/100)*discountRate);
        System.out.println("Discount price is "+discountPrice);
    }

    }


