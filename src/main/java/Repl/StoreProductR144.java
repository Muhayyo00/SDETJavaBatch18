package Repl;

public class StoreProductR144 {
    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;
public void displayInfo(){
    System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);

}
    StoreProductR144(String label, double price,String category, boolean hasExpiration,int stock){
       this.label=label;
       this.price=price;
       this.category=category;
       this.hasExpiration=hasExpiration;
       this.stock=stock;
    }
    StoreProductR144(String label, double price,int stock){
        this.label=label;
        this.price=price;
        this.category="misc";
        this.hasExpiration=false;
        this.stock=stock;
    }
    StoreProductR144(String label, double price){
        this.stock=0;
        this.label=label;
        this.price=price;


    }

    public static void main(String[] args) {
        StoreProductR144 s=new StoreProductR144("Eggs",3.0, "Produce", true, 10);
        s.displayInfo();
        StoreProductR144 s1=new StoreProductR144("Paper Towels",2.0,24);
        s1.displayInfo();
        StoreProductR144 s2=new StoreProductR144("Paper Towels", 2.0);
        s2.displayInfo();

    }
    }
