package library;


public enum Movie {
    HORROR("horror"),
    FUN("fun"),
    ACTION("action"),
    MUSICAL("musical");

    private String kind = "";

    Movie(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "kind='" + kind + '\'' +
                '}';
    }

}
