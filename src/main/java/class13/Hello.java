package class13;

public class Hello {
    /* Create a method that will say Hello in different language
    based on the country that will be passed when method is executed.
    Do it for any five countries.
     */
    void hello (String country) {
        if (country.equalsIgnoreCase("China")) {
            System.out.println("Nihao");
        } else if (country.equalsIgnoreCase("France")) {
            System.out.println("Bonjour");
        } else if (country.equalsIgnoreCase("Turkiye")) {
            System.out.println("Merhaba");
        } else if (country.equalsIgnoreCase("Tajikistan")) {
            System.out.println("Salom");
        } else if (country.equalsIgnoreCase("Poland")) {
            System.out.println("Witam");
        } else {
            System.out.println("Invalid country");
        }

    }
}
