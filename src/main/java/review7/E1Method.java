package review7;

public class E1Method {
    void print(){
        System.out.println("Hello World!!!");
    }

    public static void main(String[] args) {
        //new E1Method().print();//one way of calling the object
        E1Method e=new E1Method();
        e.print();//prints Hello World
        String str=new String("Java");
        str.toLowerCase();
        System.out.println(str.toLowerCase());//prints java
    }
}
