package class19;

public class ProductTester {
    public static void main(String[] args) {
  Product[] arr=
          {new Electronics("Lenovo Laptop", 699.99,"CU21345",1,9.0,45.99),
          new Clothing("Scarf", 29.99,"TU12567",1,8.0),
          new Furniture("Dining Set", 1200, "OP98765", 1, 8.90),
          new Books("Little Blue Truck", 16.99, "YU87654", 1, 8.90)};
  for(Product pr:arr){
      pr.totalInfo();
      pr.calculatePrice();
      pr.calculatePriceWithTax();
  }
}}
