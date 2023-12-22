package project1Java;

public class Q10 {
    public static void main(String[] args) {
        /* Write a program to print out duplicate elements from an Array of Strings?
        */
String [] names={"Muhayyo", "Omar", "Maryam", "Amina", "Muhayyo",
                 "Abdulloh", "Omar", "Amina", "Aliya", "Yusuf"};
        for (int i = 0; i < names.length; i++) {
            for (int j = i+1; j < names.length; j++) {
                if(names[i].equals(names[j])) {
                    System.out.println(names[j]);
                }
            }

        }
    }
}
