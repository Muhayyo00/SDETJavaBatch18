package class9;

public class T5 {
    public static void main(String[] args) {
      /* Create 2D array of cars:american, german, korean, italian.
      Then, retrieve all values from that array using 2 different loops.
       */
        String[][] carsArray = {
                {"Chevrolet", "Ford", "Dodge"},
                {"Volkswagen", "BMW", "Mercedes"},
                {"Hyundai", "Kia", "Genesis"},
                {"Fiat", "Ferrari", "Lamborghini"}
        };
        for (int i = 0; i < carsArray.length; i++) {
            for (int j = 0; j < carsArray[i].length; j++) {
                System.out.print(carsArray[i][j] + " ");
            }
            System.out.println();
        }
        //2nd way: Using Enhanced Loop
        System.out.println();
        System.out.println("Using Enhanced For Loop");
for(String[]arr:carsArray)  {
    for (String car:arr) {
        System.out.print(car+" ");
    }
    System.out.println();
}




    }


    }

