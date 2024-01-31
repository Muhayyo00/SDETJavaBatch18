package review10;

public class BankAccount {
    private double balance;
    private String userName;
    private String password;

    void transferFunds(double amountToTransfer) {
        balance = balance - amountToTransfer;
    }
    double getBalance(){return balance;}

    void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Insufficient balance amount");
        } else {
            this.balance = balance;
        }
    }
    void setUserName(String userName){
        if(userName.length()<8){
            System.out.println("UserName should be more than 8 characters");
    }else{
            this.userName=userName;
        }}
    void setPassword(String password){
        this.password=password;//never leave it like this. Make sure you use if/else
    }

    void printBalance() {
        System.out.println(balance);
    }

    public BankAccount(double balance, String userName, String password) {
       setUserName(userName);//we call the method that we wrote inside those methods
        setPassword(password);
        setBalance(balance);
    }

}