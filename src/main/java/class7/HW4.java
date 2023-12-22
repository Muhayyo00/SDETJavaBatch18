package class7;

public class HW4 {
    public static void main(String[] args) {
        /* Create an array of animals and store 5 animals in it.
        Using 2 different loops, print all elements from an array
         */
        String[] animals = {"Leopard", "Chita", "Wolf", "Bear", "Horse"};
        int x = 0;
        do {
            System.out.print(animals[x]+" ");
            x++;
        } while (x < 5);
        System.out.println();

        //2nd way
        for(int i=0; i<animals.length; i++) {
        System.out.print(animals[i]+" ");
        }


           }
}
