package class10;

public class PhoneTester {
    public static void main(String[] args) {

        Phone iphone=new Phone();
        iphone.model="Pro Max 14";
        iphone.make="Apple";
        iphone.price=1300;
        iphone.color="Gold";

        System.out.println(iphone.model);
        System.out.println(iphone.make);
        System.out.println(iphone.price);
        System.out.println(iphone.color);
        iphone.call();
        iphone.messaging();
        iphone.takePics();

        System.out.println("******************************************");

Phone samsung=new Phone();
samsung.make="Samsung";
samsung.model="S23 Ultra";
samsung.color="Black";
samsung.price=1000;

System.out.println(samsung.model);
System.out.println(samsung.make);
System.out.println(samsung.price);
System.out.println(samsung.color);
samsung.takePics();
samsung.simplicityUsage();
samsung.messaging();
samsung.call();

    }
}
