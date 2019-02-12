import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;


    @Before
    public void before(){
        book = new Book("Diary of an Oxygen Thief", "anonymous", "indie-lit");
    }

    @Test
    public void hasTitle(){
        assertEquals("Diary of an Oxygen Thief", book.getTitle());
    }


}

