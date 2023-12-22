package review7;
public class User {
    /* Write program: User that has a constructor that initializes instance variable name
     and mobile number. Create a subclass/child class  userInfo that will have user address
     variable and it also being initialized through constructor call. Print users name,
     mobile number and address in userDetails method. Test your code.
     */
    private String name;
    private String mNumber;

    public void UserDetails(){
        System.out.println(name+" "+mNumber);
    }
    public User(String name, String mNumber) {
        this.name = name;
        this.mNumber = mNumber;
    }
    }
    class UserInfo extends User{
        private String userAddress;
        public UserInfo(String name, String mNumber, String userAddress){
            super(name, mNumber);
            this.userAddress=userAddress;
        }
            public void userDetails(){
            super.UserDetails();
            System.out.println(userAddress);
        }

    }









