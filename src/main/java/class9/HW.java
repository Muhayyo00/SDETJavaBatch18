package class9;

public class HW {
    public static void main(String[] args) {
        /*Using 2D array create a grocery list.
         Inside you should have an array of veggies, fruits, dairy and sweets.
         Retrieve all values from that array using 2 different loops.
        */
        String[][] grocery={{"banana","apple", "watermelon", "mango"},
                            {"potatoes", "carrots", "eggplant", "broccoli"},
                            {"cheese", "milk", "sour cream", "cottage cheese"},
                            {"lollipop", "cheesecake", "sour patch", "vanilla cupcakes"}
                           };
for(int i=0; i<grocery.length;i++) {
    for(int j=0; j<grocery[i].length;j++) {
        System.out.print(grocery[i][j]+" ");
    }
    System.out.println();
}
        System.out.println();
        System.out.println("Second way: Enhanced For Loop");

for(String[]arr:grocery) {
    for(String s:arr) {
        System.out.print(s+" ");
    }
    System.out.println();
}
}

    }

