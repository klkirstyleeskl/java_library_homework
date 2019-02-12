import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;
    Book book7;
    Book book8;

    @Before
    public void before() {
        book1 = new Book("Diary of an Oxygen Thief", "Anonymous", "indie-lit");
        book2 = new Book("All fun and Games", "Christopher Brookmyre", "scottish fiction");
        book3 = new Book("I love Dick", "Chris Kraus", "indie-lit");
        book4 = new Book("Trainspotting", "Irvine Welsh", "scottish fiction");
        book5 = new Book("The Klaus Project", "Karl Kraus", "biography");
        book6 = new Book("Autobiography", "Morrissey", "biography");
        book7 = new Book("Lolita", "Vladimir Nabokov", "indie-lit");
        book8 = new Book("Attack of the Unsinkable Rubber Ducks", "Christopher Brookmyre", "scottish fiction");
    }

    @Test
    public void hasTitle(){
        assertEquals("Diary of an Oxygen Thief", book1.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Christopher Brookmyre", book2.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("biography", book5.getGenre());
    }









}

