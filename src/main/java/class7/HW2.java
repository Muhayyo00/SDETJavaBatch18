package class7;

public class HW2 {
    public static void main(String[] args) {
        /* Create an array of names and store all names of your group.
        Then print your name from that array. (use 2 different ways of creating an array)
         */
        String [] names={"Muhayyo", "Arshal","Sharif", "Nasima", "Ana", "Ksenija"};
        System.out.print(names [0]);
        System.out.println();

        //2nd way
        String [] GNames=new String [8];
        GNames [0]="Muhayyo";
        GNames [1]="Arshal";
        GNames [2]="Sharif";
        GNames [3]="Nasima";
        GNames [4]="Ana";
        GNames [5]="Ksenija";
        System.out.print(GNames[0]);


    }
}
