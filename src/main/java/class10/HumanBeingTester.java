package class10;

public class HumanBeingTester {
    public static void main(String[] args ) {

        HumanBeing woman=new HumanBeing();
        woman.race="Asian";
        woman.nationality="Tajik";
        woman.country="Tajikistan";
        woman.age=37;
        woman.height=5.1;
        woman.weight=100;
        woman.personality="kind";

        System.out.println(woman.race);
        System.out.println(woman.nationality);
        System.out.println(woman.country);
        System.out.println(woman.age);
        System.out.println(woman.height);
        System.out.println(woman.weight);
        System.out.println(woman.personality);
        woman.breath();
        woman.speak();
        woman.work();

    }

}




