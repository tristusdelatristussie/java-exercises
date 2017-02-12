package library;


public class DVD extends CD {
    private Movie kind;
    private boolean threeD;

    public DVD(String artist, int time, Movie kind, boolean threeD) {
        super(artist, time);
        this.kind = kind;
        this.threeD = threeD;
    }

    public Movie getKind() {
        return kind;
    }

    public boolean isThreeD() {
        return threeD;
    }

}
