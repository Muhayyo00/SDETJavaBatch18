package class19;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount [] arr=
                {new SavingsAccount("610 5187903",3000.90,"Theresa Angel"),
                 new CheckingAccount("863475292084",129000.800,"Mary Poppins"),
                 new FixedDepositAccount("3894639943", 400000.00, "John Snow")};

        for (int i = 0; i <arr.length ; i++) {
        arr[i].bankInfo();
         arr[i].deposit();
         arr[i].withdraw();}}}




