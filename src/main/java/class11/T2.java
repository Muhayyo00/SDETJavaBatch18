package class11;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        /*Store username, password and confirm password from user and check the following
        requirements:
        Username or Password cannot be empty, if so->"Username or Password cannot be empty"
        Password should be minimum 8 characters, if less->message="Password is too short".
        Password cannot contain username, if so->message="Password cannot contain username".
        Password should match confirmed password, if not->"Passwords do not match".
        Only after all requirements meet, ->message="Your username and password have been created".
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter username");
        String username=scanner.nextLine();
        System.out.println("Enter password");
        String password=scanner.nextLine();
        System.out.println("Confirm the password");
        String confPassword=scanner.nextLine();
        if(username.isEmpty()||password.isEmpty()) {
            System.out.println("Username or Password cannot be empty");
        }else if(password.length()<8) {
            System.out.println("Password is too short");
        }else if(password.equals(username)) {
            System.out.println("Password cannot contain username");
        }else if(!confPassword.equals(password)) {
            System.out.println("Passwords do not match");
        }else{
            System.out.println("Your username and password have been created");
        }
    }
}
