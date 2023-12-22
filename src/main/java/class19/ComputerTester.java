package class19;

public class ComputerTester {
    public static void main(String[] args) {

            Computer[]arr={new Apple("Apple", 1300, 2022),
                    new Lenovo("Lenovo", 800, 2019),
                    new HP("HP", 900, 2019),
                    new Dell("Dell", 960, 2021)};

            for (Computer comp:arr) {
                comp.compInfo();
                comp.playMusic();
                comp.switchOn();
                comp.switchOff();


            }
    }
}
