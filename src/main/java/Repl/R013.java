package Repl;

public class R013 {
    public static void main(String[] args) {
        int myNumber=12;
        int stepOne=16;
        int stepTwo=stepOne-myNumber;
        int stepThree=stepTwo/myNumber;
        int stepFour=stepThree+17;
        int stepFive=stepFour-myNumber;
        int stepSix=stepFive/6;

        System.out.println("The magic number is "+stepSix+'!');
    }
}
