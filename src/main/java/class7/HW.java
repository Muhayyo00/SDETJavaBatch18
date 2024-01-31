package class7;
public class HW {
    public static void main(String[] args) {
        /* Create an array of cars and store 6 elements into it. Using 2 different loops print
         all values from the array.
         */
      String []cars={"Mercedes", "BMW","Tesla", "Lamborghini", "Lexus", "Ferrari"};
/*cars [0]="Mercedes";//I do not have to write all the cars with their indexes.
cars [1]="BMW";
cars [2]="Tesla";
cars [3]="Lamborghini";
cars [4]="Lexus";
cars [5]="Ferrari";*/
for(int i=0; i<6; i++) {
    System.out.print(cars[i]+" ");
}
        System.out.println();
// 2nd way
int i=0;
do{
    System.out.print(cars[i]+" ");
    i++;
}while(i<cars.length);











    }
}
