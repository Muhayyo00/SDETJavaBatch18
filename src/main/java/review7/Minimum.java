package review7;

public class Minimum {
 /*Create a method to find the minimum of two numbers. Method will be passed two parameters
 and will return the minimum number. Method should work with int and double data types.
 Examples
 min(10,5)=>5
 min(2.5,3.5)=>2.5
     */
 public static double min(double n1, double n2) {
        if (n1 > n2) {
            return n2;
        }else{
            return n1;
        }
 }
  public static int min(int n1, int n2){
    if (n1 > n2) {
        return n2;
    }else{
        return n1;
    }
 }
    public static void main(String[] args) {
        System.out.println(min(10,5));
        System.out.println(min(2.5,3.5));
    }
}