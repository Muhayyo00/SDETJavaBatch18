package Repl;

public class R136 {
    public static void main(String[] args) {
M m=new M();
m.name="John";
m.city="Miami";
m.schoolName="Syntax";
m.batchNumber=9;
        m.displayInfo();

 }
        public static class M{
            public String name;
            String city;
             String schoolName;
            public int batchNumber;

            public void displayInfo(){
                System.out.println("My name is "+name+" and I live in "+city+". I study at "+schoolName+" in batch "+batchNumber);
            }
        }

}

