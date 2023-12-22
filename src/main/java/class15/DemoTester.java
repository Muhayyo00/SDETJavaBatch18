package class15;

public class DemoTester {
    public static void main(String[] args) {
         //Demo d= new Demo();
        //if I put nothing inside yellow brackets, demo 1 will be printed.
        //if I put 10 inside brackets, 2nd Demo will print.
        Demo d= new Demo("Zion Lights", 10);//Demo #4

    }
    /*it is good to have multiple constructors so that to make
    it more flexible for users. If we enter nothing inside the
    brackets in above, it will automatically choose the first
    constructor, if I put age, second will be chosen. If I put
    a name, 3rd will be chosen. Even sequence is considered.
    Look at Demo class. constructors 4 and 5 have same parameters,
    yet sequence differs. If I put age first and then name, 5th
    constructor will be chosen. If I put name first and then age,
    4th constructor will be chosen.Java checks number of parameters and
    what data type is passed inside those brackets to figure out
    which Demo is needed.
     */
}
