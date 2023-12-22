package Repl;

public class R146 {
    private String name;
    private String lastName;
    private int employeeID;
    private String startDate;
    private int salary;

    public R146() {

    }

    public R146(String name, String lastName, int employeeID, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.startDate = startDate;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println(name + " "+lastName + " " + employeeID + " " + startDate + " " + salary);
    }



    public static void main(String[] args) {
        R146 r=new R146();
        R146 r1=new R146("Joe", "Smith", 12345, "01/01/1970", 35000);
        r.printInfo();
        r1.printInfo();
    }
}

