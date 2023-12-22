package class13;

public class EmailTester {
    public static void main(String[] args) {
        Email email=new Email();
        String create=email.address("muhayyo",
                "nuridinova", "gmail");
        System.out.println(create);
    }
}
