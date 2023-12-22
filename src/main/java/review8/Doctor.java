package review8;

public class Doctor {
    public static String hospital;
   public  String firstName, lastName;
    protected String specialty;
    int yearsOfExperience;
    private double salary;

    public Doctor(String firstName, String lastName, String specialty,int yearsOfExperience){
        this.firstName=firstName;
        this.lastName=lastName;
        this.specialty=specialty;
        this.yearsOfExperience=yearsOfExperience;
    }
   public static void work(){
       System.out.println("Doctors work at "+hospital);
    }

    protected void checkVitals(){
        System.out.println(firstName+" "+lastName+" checks vitals on every patient");
    }
//What is overloading-is the same class, we have methods with same name
    //How to overload:changing number of the parameters or dataType or sequence
    //In overloading the method signature MUST be different
    //We do not care about return type, it can be void or int...

    public void checkVitals(String patient){
        System.out.println(firstName+" "+lastName+" checks vitals on "+patient);
        patient.trim();
    }
    protected void prescribeMedication(String medication){
        System.out.println(firstName+" "+lastName+" prescribed "+medication);
    }

}
class Surgeon extends Doctor{
    private String location;
    Surgeon(String firstName, String lastName, String specialty,int yearsOfExperience) {
        super(firstName, lastName, specialty, yearsOfExperience);

    }

    /*Method overriding is changing the method/s of parent class through same name
    same parameters, return type, but different implementation. in Overriding method signature
    must be same.Access modifier must be same or have wider access.
         */
    public void prescribeMedication(String patient){
        System.out.println("Surgeon "+lastName+" prescribed medication to "+patient);
    }
}
