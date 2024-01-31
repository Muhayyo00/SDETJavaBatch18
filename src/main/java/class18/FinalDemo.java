package class18;

public class FinalDemo {
    /*If we put the keyword:final before the variable and put something inside it, this field will become
    final and no one will be able to change it.
    final cannot be declared empty. It should have some variable
    Overload is changing in parameters but Overriding is changing methods
     */
    final String greetings = "Hello Everyone";
    public static final String name="Kawoon";
    void test() {
        /* if we put different message inside the greetings(greetings="Hello Guys"), it will give an error, because
        we put the word final on the top, and it has different message.greetings="Hello Guys"
         */
        final int hananeAge = 16;
        //hananeAge=30;
        final double weight = 30;
    }
}

