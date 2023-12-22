package Repl;

public class R118 {
   void spaceOut(String word) {

           System.out.println(word.replaceAll("", " "));
       }

    public static void main(String[] args) {
        R118 s=new R118();

        s.spaceOut("hello"+" ");
        s.spaceOut("technology"+" ");

    }
}
