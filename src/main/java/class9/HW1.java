package class9;

public class HW1 {
    public static void main(String[] args) {
       /* Create 2D array of countries: north america countries, south america countries,
        europe countries, asian countries, african countries. Then print all values from that
        array using 2 different loops and calculate how many total countries been stored.
        */
String[][] countries={{"Bahamas","Canada", "El Salvador", "Costa Rica"},
                      {"Argentina", "Venezuela", "Colombia", "Brazil"},
                      {"Tajikistan", "Qatar", "Singapore", "Uzbekistan"},
                      {"Nigeria", "Egypt", "Morocco", "Tunisia"}
                     };
for(int i=0; i<countries.length; i++) {
    for(int j=0; j<countries[i].length;j++) {
        System.out.print(countries[i][j]+" ");
    }
    System.out.println();
}
        System.out.println();
        System.out.println("Second Way:Enhanced For Loop");

        for(String[]arr:countries) {
            for(String x:arr) {
                System.out.print(x+" ");
            }
            System.out.println();
        }





    }
}
