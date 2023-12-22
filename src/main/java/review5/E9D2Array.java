package review5;

public class E9D2Array {
    public static void main(String[] args) {
        int [][] numbers={
                {10, 25, 30, 40, 78},
                {20, 45, 67, 23, 98},
                {30, 60, 90, 120},
        };
        System.out.println(numbers.length);
        System.out.println(numbers[1].length);
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
                
            }
            System.out.println();
            
        }

        }
    }

