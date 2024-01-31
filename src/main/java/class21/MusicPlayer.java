package class21;

public abstract class MusicPlayer {
    /*Music Player System: Create a class MusicPlayer with methods
    like play(), pause(), stop(), and fields such as currentTrack and volume.
     Implement subclasses for different types of music players, like MP3Player,
     CDPlayer, and StreamingPlayer, each with their unique implementations of the
      play() method (e.g., streaming from the internet, playing from a CD).
     */
    private String currentTrack;
    private int volume;
    public abstract void play();
    public void pause(){
        System.out.println("The Music is paused");
    }
    public void stop(){
        System.out.println("The music is stopped");}

        public void musicInfo(){
        System.out.println(currentTrack+" "+volume);
    }
    MusicPlayer(String currentTrack, int volume){
        this.currentTrack=currentTrack;
        this.volume=volume;
    }
}
    class MP3Player extends MusicPlayer{
    MP3Player(String currentTrack, int volume) {
        super(currentTrack, volume);}
        public void play(){
        System.out.println("Playing from MP3");
    }
    }
    class CDPlayer extends MusicPlayer{
    CDPlayer(String currentTrack, int volume){
        super(currentTrack, volume);
    }
        public void play(){
            System.out.println("Playing from a CD");
        }
    }

            class StreamingPlayer extends MusicPlayer{
    StreamingPlayer(String currentTrack, int volume){
        super(currentTrack, volume);
    }
     public void play(){
         System.out.println("Streaming from the Internet");
                }

                public static void main(String[] args) {
                    MusicPlayer[]arr={
                            new MP3Player("MP3 Music", 20),
                            new CDPlayer("CD Music", 30),
                            new StreamingPlayer("olala Music", 25)};
                    for (int i = 0; i < arr.length; i++) {
                        arr[i].play();
                        arr[i].pause();
                        arr[i].stop();
                        arr[i].musicInfo();
                        System.out.println("*******************************************************");
                    }
                    }
                    }


