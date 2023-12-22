package class12;

public class E1StringDemo {
    public static void main(String[] args) {
        String str="Its Savera's Birthday today. It's Sunday.Today is Java Class";
        String [] strArr=str.split("[.]");
        System.out.println(strArr.length);//prints 3, because there are 3 sentences.
        System.out.println(strArr.length);//prints 9, because there are 9 spaces.
        System.out.println(strArr[0]);//it will print only 1st sentence. It's Savera's Birthday today.
        System.out.println(strArr[1].trim());//trims the space before It's Sunday
        System.out.println(strArr[2].trim());//Today is Java Class.

    }


}
