package class12;

public class E2StringDemo {
    public static void main(String[] args) {
        String str="It's Savera's Birthday today. It's Sunday.Today is Java Class";
        String[] wordArr=str.split(" ");//finds out number of spaces. 9 spaces.
        System.out.println(wordArr.length);//prints 9, 9 spaces
        System.out.println(wordArr[0]);//prints the letters before the first space:It's

    }


}
