package class11;

public class E11StringDemo {
    public static void main(String[] args) {
        String str="nbdnsASDJKHDOgdjaf,bd,mf%$#@*&nl123435";
        System.out.println(str.replaceAll("[A-Z]","*"));//uppercase letters be repl by *
        System.out.println(str.replaceAll("[a-z]","*"));//lowercase be repl by*
        System.out.println(str.replaceAll("[0-9]","*"));//numbers be repl by*
        System.out.println(str.replaceAll("[A-D]","*"));//letters from A to D be replaced
        System.out.println(str.replaceAll("[A-Za-z]","*"));//all upper and lower case letter be replaced by *
        System.out.println(str.replaceAll("[A-Za-z0-9]","*"));//everything except special characters be replaced by *
        System.out.println(str.replaceAll("[^A-Z]","*"));//repl everything but not uppercase A to Z
        System.out.println(str.replaceAll("[^A-Za-z]","*"));//replace everything except the upper and lowercase letter        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));//
        System.out.println(str.replaceAll("[A-Z]",""));//deletes uppercase letters from A to Z.
        System.out.println(str.replaceAll("[!-?]", ""));//replaces all the characters that come from ! to ?. Look regex chart
        System.out.println((int)'A');//prints the number letter'A' is shown on the regex chart.
        System.out.println(str.replaceAll("[\\d]", ""));//delete all the digits
        System.out.println(str.replaceAll("[\\s]", ""));//delete all the spaces in between

    }

    }

