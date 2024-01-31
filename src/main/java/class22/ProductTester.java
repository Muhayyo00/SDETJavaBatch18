package class22;

public class ProductTester {
    public static void main(String[] args) {
        Product product=new Product("FDR123435", "TV",699.99,4);
        product.printProductDetails();
        System.out.println("********************************************************");
        product.setProductName("Samsung 55' TV");
        product.setPrice(650.99);
        product.restock(200);
        product.sell(120);



    }
}
