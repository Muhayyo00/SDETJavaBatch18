package class12;

public class StringVsStringBuilder {
    public static void main(String[] args) {

        /*There are more than 100 sister classes of String class. We will cover String, StringBuilder
        and StringBuffer.
        StringBuilder-fast, but not threadsafe. Is used most of the time. Picture of Smile
        StringBuffer-slow, but threadsafe. Used when you have multiple brains
        working at the same time.Picture of Mona Lisa.
        */
        String address="USA";
        String address0="USA";
        String address1="USA";
        String address2="USA";
        String address3="USA";
        String address4="USA";
        String address5="USA";

        String ad="Canada";
        StringBuffer sb=new StringBuffer("Hello");


    }
}
