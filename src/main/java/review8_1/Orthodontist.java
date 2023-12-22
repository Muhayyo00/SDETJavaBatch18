package review8_1;

import review8.Doctor;

public class Orthodontist extends Doctor {
    public Orthodontist(String firstName, String lastName, String specialty,int yearsOfExperience){
        super(firstName, lastName, specialty, yearsOfExperience);
    }
    public void printSpecialty(){
        System.out.println("I am a "+specialty);
    }
    public void prescribeMedication(String medication){
        System.out.println(specialty+" prescribes special medication"+medication);
        }
}
