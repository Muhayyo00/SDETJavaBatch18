package class13;

public class Email {
    /* Create a method that will create an Email().
    Based on values of users firstName, lastName and email type,
    your method should return complete email address.
    Example:createEmail(John, Snow, gmail)-->johnsnow@gmail.com
     */

    String address(String firstName, String lastName, String email)
    {
        return firstName+lastName+"@"+email+".com";
    }
}
