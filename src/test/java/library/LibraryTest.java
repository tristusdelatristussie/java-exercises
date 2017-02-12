package library;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class LibraryTest {

//    @Test
//    public void test() {
    //set
    //un livre est caractérisé par son nom, nombre de page
    //dvd est caractérisé par un son nom, sa durée, catégorie, 3d
    //cd est caractérisé par son nom, sa durée
    //pour emprunter un livre c'est gratuit
    //pour emprunter un dvd c'est payant 2 euros
    //pour emprunter un cd c'est 1 euro
    //bibliothèque est caractérisé par ses livres, ses dvd, ses cd et un budget de 50 euros
    //bibliothèque doit avoir une méthode isOpen()
    //bibliothèque peut avoir comme limit 3 dvd . Pas de limit pour les livres et les cd
    //Elle ouvre entre 1pm et 7pm
    //un client vient enprunter un livre
    //afficher le nombre de livre restant
    //un autre client vient emprunter 5 dvd
    //afficher le budget de la bibliothèque
    //un client vient a 9pm, quel est le résultat
    //test
    //assert
//    }

    @Test
    public void put_books() {
        //set
        Book book = new Book("book", 50);
        Book book1 = new Book("book1", 150);
        Book book2 = new Book("book2", 300);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book1);
        books.add(book2);
        Library library = new Library();
        //test
        ArrayList<Book> result = library.putBooks(books);

        //assert
        assertEquals(3, result.size());
    }

    @Test
    public void put_dvds() {
        //set
        DVD dvd = new DVD("dvd", 120, Movie.HORROR, false);
        DVD dvd1 = new DVD("dvd1", 130, Movie.ACTION, true);
        ArrayList<DVD> dvds = new ArrayList<>();
        dvds.add(dvd);
        dvds.add(dvd1);

        Library library = new Library();

        //test
        ArrayList<DVD> result = library.putDvds(dvds);
        //assert
        assertEquals(2, result.size());
    }


    @Test
    public void put_dvds_5() {
        //set
        DVD dvd = new DVD("dvd", 120, Movie.HORROR, false);
        DVD dvd1 = new DVD("dvd1", 130, Movie.ACTION, true);
        ArrayList<DVD> dvds = new ArrayList<>();
        dvds.add(dvd);
        dvds.add(dvd1);
        Library library = new Library();
        ArrayList<DVD> result1 = library.putDvds(dvds);


        DVD dvd2 = new DVD("dvd2", 120, Movie.HORROR, false);
        DVD dvd3 = new DVD("dvd3", 30, Movie.ACTION, true);
        DVD dvd4 = new DVD("dvd4", 60, Movie.MUSICAL, false);
        DVD dvd5 = new DVD("dvd5", 180, Movie.FUN, true);
        //test
        ArrayList<DVD> result = library.putDvds(dvds);

        assertEquals(2, result.size());

    }


    @Test
    public void put_4_dvds() {
        //set
        DVD dvd = new DVD("dvd", 120, Movie.HORROR, false);
        DVD dvd1 = new DVD("dvd1", 30, Movie.ACTION, true);
        DVD dvd2 = new DVD("dvd2", 60, Movie.MUSICAL, false);
        DVD dvd3 = new DVD("dvd3", 180, Movie.FUN, true);
        ArrayList<DVD> dvds = new ArrayList<>();
        dvds.add(dvd);
        dvds.add(dvd1);
        dvds.add(dvd2);
        dvds.add(dvd3);

        Library library = new Library();

        //test
        ArrayList<DVD> result = library.putDvds(dvds);
        //assert
        assertEquals(0, result.size());
    }

    @Test
    public void put_3_dvds_with_2_same_dvds() {
        //set
        DVD dvd = new DVD("dvd", 120, Movie.HORROR, false);
        DVD dvd1 = new DVD("dvd1", 30, Movie.ACTION, true);
        ArrayList<DVD> dvds = new ArrayList<>();
        dvds.add(dvd);
        dvds.add(dvd1);
        dvds.add(dvd1);

        Library library = new Library();

        //test
        ArrayList<DVD> result = library.putDvds(dvds);
        //assert
        assertEquals(2, result.size());
        assertEquals("dvd", result.get(0).getTitle());
        assertEquals("dvd1", result.get(1).getTitle());
    }

    @Test
    public void put_cds() {
        //set
        CD cd = new CD("title", 60);
        CD cd1 = new CD("artist1", 30);
        ArrayList<CD> cds = new ArrayList<>();
        cds.add(cd);
        cds.add(cd1);

        Library library = new Library();
        //test
        ArrayList<CD> result = library.putCDs(cds);
        //assert
        assertEquals(2, result.size());
    }

    @Test
    public void isOpen_on() {
        //set
        Library library = new Library();
        //test
        boolean result = library.isOpen(1);
        //assert
        assertTrue(result);
    }

    @Test
    public void isOpen_off() {
        //set
        Library library = new Library();
        //test
        boolean result = library.isOpen(10);
        //assert
        assertFalse(result);
    }

}
