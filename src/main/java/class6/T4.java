package class6;

public class T4 {
    public static void main(String[] args) {//while loop
        //Print even numbers from 20 to 100

        int x=20;
        while(x<=100)
        if(x%2==0){
            System.out.print(x+" ");
            x+=2;
        }
int c=20;//do while loop
        do{
            System.out.print(c+" ");
            c+=2;
        }while(c<=100);


        for(int s=20; s<=100; s+=2) {
            System.out.println(s);
        }//for loop

    }
}
