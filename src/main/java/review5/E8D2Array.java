package review5;

public class E8D2Array {
    public static void main(String[] args) {
        int [][] numbers={
                {10, 25, 30, 40, 78},
                {20, 45, 67, 23, 98},
                {30, 60, 90, 120},
                };
        int[] row0=numbers[0];//we need [] because we mention the whole 1D array from 2D array
        int num=numbers[2][2];//we mention only 1 element from 2D array-->10
        System.out.println(num);

    }
}
