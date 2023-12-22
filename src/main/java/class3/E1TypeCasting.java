package class3;

public class E1TypeCasting {
    public static void main(String[] args) {
      int age=10;
      double age2=age;
        System.out.println(age);
        //we moved from smaller int box to a larger double box
        //that is why no issues
        System.out.println(age2);

double largeBox=10.5;
int smallBox=(int)largeBox;
        System.out.println(smallBox);

short mediumBox=1300;
byte smallestBox=(byte)mediumBox;
        System.out.println(smallestBox);






    }
}
