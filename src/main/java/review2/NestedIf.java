package review2;

public class NestedIf {
    public static void main(String[] args) {

//nested if-> if statement inside another if
        /* if (condition) {
        if (condition)
        }
         */
boolean allergy=true;
String allergyType="fish";

if (allergy) {//outer if
    System.out.println("Let's check what kind of allergy you have");
    if (allergyType.equals ("peanut")) {//nested if
        System.out.println("Please avoid the food that contains peanuts");
    }else if (allergyType.equals ("dairy")) {
        System.out.println("Please avoid food with dairy products");
    }else if (allergyType.equals ("pollen")) {
        System.out.println("Please stay indoors when the trees are blooming");
    }
}


    }
}
