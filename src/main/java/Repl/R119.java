package Repl;

public class R119 {
    public String censorLetter(String s, char ch){
        String newString="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                newString+="*";

            }
            else{
                newString+=s.charAt(i);
            }
        }
        return newString;
    }
    public static void main(String[]args){
        R119 m=new R119();
        System.out.println(m.censorLetter("computer science",'e'));
        System.out.println(m.censorLetter("trick or treat",'t'));
    }
}

