package class14;

public class Person {
    static int numOfEye=2;
   private String name;
    private int age;
    private double weight;
   private double salary;
   private String favPLanguage;
   public Person(String pName, int pAGe, double pWeight, double pSalary, String pFavPLan){
      name=pName;
      age=pAGe;
      weight=pWeight;
      salary=pSalary;
      favPLanguage=pFavPLan;
   }
    public Person(String pName, int pAGe, double pWeight, double pSalary){
        name=pName;
        age=pAGe;
        weight=pWeight;
        salary=pSalary;

    }

    //Instance method
    public void printInfo() {
        System.out.println(name + " " + age + " " + weight);
    }

    //Static method
    static void printOfEyes(){
        System.out.println(numOfEye);
    }
}
