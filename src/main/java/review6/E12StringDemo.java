package review6;

public class E12StringDemo {
    public static void main(String[] args) {
String str="My name is James and my Number is 9280382094";
        String number=str.replaceAll("[^\\d]", "");//1st way
        String num=str.replaceAll("[^0-9]", "");//2nd way
        System.out.println(number);
        System.out.println(num);
        StringBuilder stringBuilder=new StringBuilder("Java");
        System.out.println(stringBuilder);














    }
    }

