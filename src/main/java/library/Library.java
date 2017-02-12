package library;

import java.util.ArrayList;

public class Library implements ILibrary{

    public static final int STORAGE_MAX = 3;

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<DVD> dvds = new ArrayList<>();
    private ArrayList<CD> cds = new ArrayList<>();


    public ArrayList<Book> putBooks(ArrayList<Book> books) {
        this.books.addAll(books);
        return this.books;
    }


    public ArrayList<DVD> putDvds(ArrayList<DVD> dvds) {
        for (DVD dvd : dvds) {
            if (!this.dvds.contains(dvd)) {
                this.dvds.add(dvd);
            }
        }

        if (this.dvds.size() > STORAGE_MAX) {
            this.dvds.removeAll(dvds);
        }
        return this.dvds;
    }

    public ArrayList<CD> putCDs(ArrayList<CD> cds) {
        this.cds.addAll(cds);
        return this.cds;
    }

    public boolean isOpen(int hour) {
        if (hour >= 1 && hour <= 7) {
            return true;
        }
        return false;
    }

}
