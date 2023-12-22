package class14;

public class SyntaxEmployee {
    /*Create a Class called SyntaxEmployee:
    1) Create three variables empId, salary and set the CEO to "Sumair".
    2)Create two objects of the class SyntaxEmployee.
    3) Set the value of eID, salary for each of the objects.
    4) Print out the eID, salary and CEO for each of the objects.
     */

    int empId;
    double salary;
    static String CEO="Sumair";


    public static void main(String[] args) {
        SyntaxEmployee nEm1=new SyntaxEmployee();
        nEm1.empId=2345456;
        nEm1.salary=65000;
        System.out.println(nEm1.empId);
        System.out.println(nEm1.salary);
        System.out.println(SyntaxEmployee.CEO);
        System.out.println();
        SyntaxEmployee nEm2=new SyntaxEmployee();
        nEm2.empId=34354646;
        nEm2.salary=75000;
        System.out.println(nEm2.empId);
        System.out.println(nEm2.salary);
        System.out.println(SyntaxEmployee.CEO);


    }
}
