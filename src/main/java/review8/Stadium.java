package review8;

public class Stadium {
    public static void main(String[] args) {
       Sport sport=new Sport("Soccer", "Pakhtakor");
        System.out.println(sport.type+" and team name is "+sport.teamName);
        System.out.println(sport.numOfPlayers);

       Sport sport1= new Sport("Basketball", "Chicago Bulls", 15, "Chicago", "Johny Smith");
    }
}
