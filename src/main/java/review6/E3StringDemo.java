package review6;

public class E3StringDemo {
    public static void main(String[] args) {

       // System.out.println(str.toLowerCase().trim().length());//these methods can be used together
        String str="703-1542-34545";
        if(str.startsWith("703")){
            System.out.println("Number is from Virginia");
        }
        System.out.println(str.endsWith("45"));



    }
}
