package class14;

public class Cat {
    //instance variable
    String name="kitti";
    void printName(){
        //local variable
        String name="Pishak";
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cat c=new Cat();
           c.printName();
//when we have local and instance, the priority is local
        }
}
