package Repl;

public class R120 {
private  int year;
private  String schoolName;
private  int batchNumber;

public void printInfo(){
    System.out.println("I am a student of batch "+batchNumber+" studying at "+schoolName+" in the year of "+year);
}
R120(int year, String schoolName, int batchNumber){
    this.year=year;
    this.schoolName=schoolName;
    this.batchNumber=batchNumber;
}

    public static void main(String[] args) {
    R120 r=new R120(2021, "Syntax", 9);
    r.printInfo();


    }


}
