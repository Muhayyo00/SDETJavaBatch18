package review9;

public class PolyTester {
    public static void main(String[] args) {
       Dog d=new Dog("Jacky", "Black",1,"German");
       Cat c=new Cat("Manu","White", 5);
       Animal[]animals={d,c};
       for(Animal a:animals){
           a.eat();
           a.speak();
           a.printInfo();
           String str= a.getName();
           System.out.println(str);
           if(a instanceof Dog){//it will print "run" method ONLY when animal has Dog class
               Dog d2=(Dog)a;
               d2.run();
           }
           }

      // Animal a=animals[0];//upcasting, converting dog to animal
       // Dog d2=(Dog)a;//down-casting, converting animal to a dog
       // d2.run();
    }
}
