package class5;

public class E2LogicalOperators {
    public static void main(String[] args) {
        String country="Australia";
        if (!country.equals("Iran")) {//You cannot visit the USA if you are from Iran.
            System.out.println("You can visit the USA");
        }else{
            System.out.println("You cannot visit the USA");
        }
    }
}
