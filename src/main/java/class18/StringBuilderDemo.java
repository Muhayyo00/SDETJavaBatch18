package class18;

public class StringBuilderDemo {
    public static void main(String[] args) {

        //concatenation with String class
        String str="Hello";
        System.out.println(str.concat("And Welcome"));

        //appending(concatenation) with String builder
        //concatenation in String is same as appending in String Building
        //when you focus on saving space, go with String class. When you focus on speed, go with StringBuilder.
        StringBuilder sb=new StringBuilder("Hello");
        sb.append("And Welcome");

        //Regular expressions-used to validate all the data when you create an email address.
        //make sure nobody enters a garbage data, length of username and password, characters....

    }
}
