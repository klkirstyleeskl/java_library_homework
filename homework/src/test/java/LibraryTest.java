import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;
    Book book7;
    Book book8;


    @Before
    public void before(){
        library = new Library("Love to Read", 10);

    }

    @Test
    public void hasName(){
        assertEquals("Love to Read", library.getName());
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, library.getInitialStockValue());
    }

    @Test
    public void canAddBookToStock(){
        assertEquals(1, library.addBook(book1));
    }

}

