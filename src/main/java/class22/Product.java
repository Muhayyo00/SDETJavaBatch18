package class22;

public class Product {
    private String productID;
    private String productName;
    private double price;
    private int stockQuantity;

    public Product(String productID, String productName, double price, int stockQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    public String getProductID(){return productID;}
    public String getProductName(){return productName;}
    public void setProductName(String productName){this.productName=productName;}
    public double getPrice(){return price;}
    public void setPrice(double price){this.price=price;}
    public int getStockQuantity(){return stockQuantity;}
    public void setStockQuantity(int stockQuantity){this.stockQuantity=stockQuantity;}

    public void restock(int amount){
        if (amount >= 0) { stockQuantity=stockQuantity+amount;
            System.out.println("Restock: "+amount+" pc");
        }else{
            System.out.println("Invalid");}}

    public double sell(int amount){
        if (amount>0&&amount<=stockQuantity){stockQuantity=stockQuantity-amount;
    double totalPrice=amount*price;
        System.out.println("Product sold: "+amount+" pc for $"+totalPrice);
    return totalPrice;
    }else{
        System.out.println("The product quantity is not available at the moment. Please check again later.");
        return 0;}}

    public void printProductDetails(){
        System.out.println("Product ID: "+productID+" "+"Product name: "+productName+" "+"Price: $"+price+" "+"Stock quantity "+stockQuantity);
    }}

