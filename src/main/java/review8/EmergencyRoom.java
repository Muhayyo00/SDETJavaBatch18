package review8;

import review8_1.Orthodontist;

public class EmergencyRoom {
    public static void main(String[] args) {
        Doctor[] doc=
                {new Surgeon("John", "Doe", "Surgeon", 20),
                new Surgeon("Michael", "Jordan", "Surgeon", 20),
                new Orthodontist("Josh","Smith", "Orthodontist",16)};

        //doc[0].checkVitals();
        //doc [0].checkVitals("Jane");
        //doc[0].prescribeMedication("Pills");

        for (int i = 0; i < doc.length; i++) {
            doc[i].checkVitals();
            doc[i].checkVitals("Jane");
            doc[i].prescribeMedication("Pills");
            System.out.println("___________________________________________________________________________");
        }
        System.out.println("__________Enhanced For Loop_____________________________________");
        for(Doctor d:doc){
            d.checkVitals();
            d.checkVitals("Kevin");
            d.prescribeMedication("Pain Killer");
        }


    }
}
