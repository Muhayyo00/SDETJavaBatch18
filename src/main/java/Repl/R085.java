package Repl;

public class R085 {
    public static void main(String[] args) {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        int sumOdd=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                for(int j=0;j<a[i].length;j++){
                    if(j%2==0){
                        sumOdd+=a[i][j];
                    }
                }

            }
        }
        System.out.println(sumOdd);
    }

    }
