package Repl;

public class Practice {
    public static void main(String[] args) {

        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a[i].length; j++) {
                    if (j % 2 == 0) {
                        count = count+a[i][j]++;
                    }

                }

            }

        }
        System.out.println(count);

    }
        }



