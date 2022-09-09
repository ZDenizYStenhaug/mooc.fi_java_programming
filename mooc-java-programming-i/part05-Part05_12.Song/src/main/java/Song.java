
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }
        if(!(compared instanceof Song) ){
            return false;
        }
        
        Song comparedS = (Song) compared;
        if(this.artist == comparedS.artist &&
                this.name == comparedS.name &&
                this.durationInSeconds == comparedS.durationInSeconds) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
