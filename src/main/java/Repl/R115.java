package Repl;

public class R115 {
    String type(String word){
        for (int i = 0; i < word.length(); i++) {

        }
        String type1=word.toUpperCase();
        return type1;

    }

    public static void main(String[] args) {
        R115 f=new R115();
        String p=f.type("test");
        System.out.println(p);
    }


}
