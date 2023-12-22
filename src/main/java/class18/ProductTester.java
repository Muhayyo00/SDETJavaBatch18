package class18;

public class ProductTester {
    public static void main(String[] args) {
Product product = new Product("Unicorn lamp", 20, 2);
DiscountedProduct dProduct=new DiscountedProduct("Unicorn lamp", 20, 2, 25);
product.displayPrice();
dProduct.displayPrice();
    }
}
