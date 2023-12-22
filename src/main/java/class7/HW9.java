package class7;

public class HW9 {
    public static void main(String[] args) {
        //From an array of integer elements find the largest number
        int [] num={8,10,14, 18, 99, 104, 675, 964};
       int largest=0;
       for(int i=0; i<num.length; i++) {
           if(largest<num[i]) {
               largest=num[i];
           }
       }

        System.out.println(largest);


    }
}
