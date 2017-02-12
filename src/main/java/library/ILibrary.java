package library;

import java.util.ArrayList;


interface ILibrary {

    ArrayList<Book> putBooks(ArrayList<Book> books);

    ArrayList<DVD> putDvds(ArrayList<DVD> dvds);

    ArrayList<CD> putCDs(ArrayList<CD> cds);

    boolean isOpen(int hour);
}
