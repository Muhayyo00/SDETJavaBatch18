package class15;

public class Students {
    /*Write a java Class Students that has a constructor which
    takes students name and 3 subject grades. Inside your class
    also have a method to Calculate Average Grade. Test Student
    class for 2 different students with different marks. Your
    program should print an average mark of each student's name.
    NOTE: Please use different names for instance and local variables./*
    */

    private String name;
    private double s1Marks;
    private double s2Marks;
    private double s3Marks;


    public Students(String sName, double m1, double m2, double m3) {
       name=sName;
        s1Marks=m1;
        s2Marks=m2;
        s3Marks=m3;


    }
    public void calcAvg() {
        double avg=(s1Marks+s2Marks+s3Marks)/3;
        System.out.println(name+"s Avg Marks are "+avg);}
    }




