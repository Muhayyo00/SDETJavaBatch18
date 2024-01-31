package class12;

public class E3StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello World");
        System.out.println(sb.reverse());//reverse the sentence
        System.out.println(sb.deleteCharAt(0));//delete the letter H
        System.out.println(sb.insert(0, "H"));//add letter H to index 0
        System.out.println(sb.length());//11 elements including space



    }
}
