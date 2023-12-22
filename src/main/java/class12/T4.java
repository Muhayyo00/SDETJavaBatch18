package class12;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
/*Write a program that reads two people's first names and if they are expecting a boy or a girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter father's first name");
        String fName=sc.nextLine();
        System.out.println("Enter mother's first name");
        String mName=sc.nextLine();
        System.out.println("Boy or Girl?");
        String gender=sc.next();
        if(gender.equals("Boy")) {
            String firstpartfName=fName.substring(0,fName.length()/2);
            String lastnamemName=mName.substring(mName.length()/2, mName.length());
            System.out.println(firstpartfName+lastnamemName);
        }else{
            String firstpartmName=mName.substring(0,mName.length()/2);
            String lastnamefName=fName.substring(fName.length()/2, fName.length());
            System.out.println(firstpartmName+lastnamefName);
        }




    }
}
