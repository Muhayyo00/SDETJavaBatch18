package class20;
public abstract class Computer {
 ///ABSTRACT means something incomplete
//We can not create an object of the Abstract Class
//Every abstract class MUST have Inheritance

       public static String type;
       String name,color;
        int memory;

        public Computer(String name,int memory,String color){
            this.color=color;
            this.memory=memory;
            this.name=name;
        }

        /*
        OPTIONAL                     OPTIONAL                       MUST           MUST
        ( Access Modifier          NON-access modifier             Return Type      Name(){}
         Public,private,         (Static-Final-Abstract)
         protected,default)

         */

    public static void playSong(){
        System.out.println("I can play music on my "+type);
    }
    protected void printInfo(){
        System.out.println("I have "+name+" computer with "+memory+" memory");
    }

     abstract void executeCode();
    public abstract void readEmails();
    }
    class Apple extends Computer {
        public Apple(String name,int memory,String color){
    super(name,memory,color);
        }

        //When we provide implementation to abstract classes we MUST follow
        //rules of Overriding!!!!
        //Overriding:Same method name and parameter MUST be same
        //method signature MUST be same

    //Return TYpe MUST be same-Access modifiers must be same OR wider


        void executeCode(){
            System.out.println("Executing code on "+type+" "+name);
        }

        @Override
        public void readEmails() {
            System.out.println(name+" can read my emails");
        }
    }

