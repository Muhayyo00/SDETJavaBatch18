package class3;

public class E12IfElse {
    public static void main(String[] args) {
        String name="Karimi";
        // whenever we have a non-primitive (String) type, we should never use == sign

        if(!name.equals("Sino")){
            System.out.println("Fast");
        }else{
            System.out.println("Moderate");
        }

       int age=34;
        if(age<13){
            System.out.println("The fair is $2");
        }else{
            System.out.println("The fair is $5");
        }

int testScore=36;
        if(testScore>=50){
            System.out.println("Pass");
        }else{
              System.out.println("Fail");
            }

        String trafficLight="Red";
        String trafficLight1="Yellow";
        String trafficLight2="Green";
    if(trafficLight.equals("Red")){
        System.out.println("Stop");
    }else if(trafficLight.equals("Yellow")){
        System.out.println("Caution");
    }else if(trafficLight.equals("Green")){
        System.out.println("Go");
    }else{
        System.out.println("Fail");
    }




        }






    }

