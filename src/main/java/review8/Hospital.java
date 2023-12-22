package review8;

import review8_1.Orthodontist;

public class Hospital {
    public static void main(String[] args) {
        Doctor.hospital="Inova";
     Surgeon surgeon= new Surgeon("John", "Doe", "Surgeon", 20);
   surgeon.checkVitals();
   surgeon.checkVitals("Jane Smith");//parent class
        surgeon.prescribeMedication("Smith");//child class
        Doctor.work();//accessing static method in static way from the class where it was defined
        Surgeon.work();//accessing static method from parent class using child className

Orthodontist ortho=new Orthodontist("Josh","Smith", "Orthodontist",16);
    Orthodontist.work();//from parent class
    ortho.checkVitals();//come from parent class
    ortho.prescribeMedication(" Pain Killers");//from child class
    ortho.printSpecialty();//from child class
        /* Polymorphism in JAVA:
        1.Compile Time/Static Binding/Early Binding-achieved through method over-loading
        2.RunTime/Dynamic Binding/Late Binding-achieved through method overriding
         */
        System.out.println("_________________________________________________________________________________");
        Doctor ortho1=new Orthodontist("Josh", "Smith","Orthodontist", 16);
ortho1.checkVitals();//from parent class
ortho1.checkVitals("Michael");//from parent class
        //we are achieving a runtime polymorphism through method overriding
        //during tun time Java gives preference to the Object type(in this case it is the object of child class
ortho1.prescribeMedication("Pills");//JAVA executed child class method

  Doctor sur=new Surgeon("John", "Doe", "Surgeon", 20);
sur.checkVitals();
sur.checkVitals("Mohammed");
sur.prescribeMedication("pills");

}


}
