package review6;

public class E6StringDemo {
    public static void main(String[] args) {
        String str="Today is a JAVA review class";
        System.out.println(str.charAt(4));
        //System.out.println(str.charAt(5));//will print space, because there is a space on index 5.
        //convert all letters to lower case
        str=str.toLowerCase();
        int count=0;
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)=='a') {
                count++;
            }
          }
        System.out.println("Letter a appeared "+count+" times");
        }
    }

