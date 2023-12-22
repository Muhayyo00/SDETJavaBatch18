package review8;

public class Sport {

    //We MUST specify dataType and name of variable
//instance variables
    String type, teamName;
    int numOfPlayers;

    String location;

    String coach;

    Sport(String type, String teamName){
        this.type=type;
        this.teamName=teamName;
    }
Sport(String type, String teamName,int numOfPlayers, String location, String coach){
    this(type, teamName);
        this.numOfPlayers=numOfPlayers;
    this.location=location;
    this.coach=coach;
}



    //static variables;
    static boolean fun;

    //MUST specify returnType and name


    void play(){
        System.out.println("We play "+type);
    }

    void watch(String stream){
        System.out.println("I am watching "+type+" on "+stream);
    }





}