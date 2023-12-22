package class11;

public class T1 {
    public static void main(String[] args) {
        /*Store username, password and confirm password from user and check the following
        requirements:
        1)Username or Password cannot be empty, if so->"Username or Password cannot be empty"
        2)Password should be minimum 8 characters, if less->message="Password is too short".
        3)Password cannot contain username, if so->message="Password cannot contain username".
        4)Password should match confirmed password, if not->"Passwords do not match".
        Only after all requirements meet, ->message="Your username and password have been created".
         */
        String username="Muhayyo";
        String password="lalala2019";
        String confirmPassword="lalala2019";

        if(username.isEmpty()||password.isEmpty()) {
            System.out.println("Username or Password cannot be empty");
        }else if(password.length()<8) {
            System.out.println("Password is too short");
        }else if((password.contains(username))){
            System.out.println("Password cannot contain username");
        }else if(!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match");
        }else{
            System.out.println("Your username and password have been created");
        }


    }
}
