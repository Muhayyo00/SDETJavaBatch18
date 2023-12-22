package class14;

public class Account {
    String accountNumber="SD122345875845";
    private double balance=350;
    String username="user123";
    private String password="Pass123";
    private void printInfo() {
        System.out.println(accountNumber);
    }

    public static void main(String[] args) {
        Account a=new Account();
        System.out.println(a.password);
        a.printInfo();
        //private can be used only in the same class and not in other classes.
    }

}
