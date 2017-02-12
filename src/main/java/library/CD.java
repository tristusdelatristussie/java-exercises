package library;


public class CD {

    protected String title;

    protected int time;

    public CD(String title, int time) {
        this.title = title;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public int getTime() {
        return time;
    }
}
