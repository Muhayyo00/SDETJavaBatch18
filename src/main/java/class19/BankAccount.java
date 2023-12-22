package class19;

public class BankAccount {
    /*Banking System Task: Design a BankAccount class with subclasses SavingsAccount,
    CheckingAccount, and FixedDepositAccount.

Common attributes might include accountNumber, balance, and accountHolderName.
Override methods like withdraw and deposit in each subclass to handle specific rules.
Introduce unique methods like applyInterest in SavingsAccount.
Create objects of each type, store them in a list, and perform operations like depositing
and withdrawing funds.
     */
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public void bankInfo(){
        System.out.println(accountNumber+" "+balance+" "+accountHolderName);
    }
    public void withdraw(){
        System.out.println("You can withdraw up to $5000.00 cash depending on specifications of your Bank account");
    }
    public void deposit(){
        System.out.println("You can deposit depending on specifications of your Bank account.");
    }

    public BankAccount(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }
}
class SavingsAccount extends BankAccount{
    SavingsAccount(String accountNumber, double balance, String accountHolderName){
        super(accountNumber,balance,accountHolderName);
    }
    @Override
    public void withdraw(){
        System.out.println("You cannot withdraw cash from your Savings account for up to 6 months after your deposit was made");
    }
    public void deposit(){
        System.out.println("You will get 0.38% APY on your deposit.");
    }
public void applyInterest(){
    System.out.println("You can earn up to 11X the national average savings account rate with this savings account.");
}
}
class CheckingAccount extends BankAccount{
    CheckingAccount(String accountNumber, double balance, String accountHolderName){
        super(accountNumber,balance,accountHolderName);}
    @Override
   public void withdraw(){
    System.out.println("You can withdraw up to $5000.00 cash from your Checking account within one business day.");
}
public void deposit(){
    System.out.println("You can deposit up to $10000.00 a months.");}}

class FixedDepositAccount extends BankAccount{
    FixedDepositAccount(String accountNumber, double balance, String accountHolderName){
        super(accountNumber,balance,accountHolderName);
}
    @Override
    public void withdraw(){
        System.out.println("You cannot withdraw any cash from your FixedDeposit account for the period of 1 year.");
    }
    public void deposit(){
        System.out.println("You will get higher rate of interest than a regular savings account if you deposit today.");
    }}


