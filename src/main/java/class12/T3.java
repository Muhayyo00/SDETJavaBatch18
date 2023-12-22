package class12;

public class T3 {
    /* You have a String a="Is it saturday? Is it raining? Do we have Java Class today?"
    How would you find out how many sentences are in that String?
     */
    public static void main(String[] args) {
        String a="Is it Saturday? Is it Raining? Do we have a Java class today?";
       // String []aArr=a.split("[?]");
       // System.out.println(aArr.length);
        System.out.println(a.split("[?]").length);//second way to do it


    }
}
