
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

/**
 * The test class ItemTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ItemTest
{
    Item<Book> testerBook;
    Item<CompactDisk> testerCD;
    Item<Book> nullTesterBook;
    Item<CompactDisk> nullTesterCD;
    
    Book book;
    Book nullBook;
    final String title = "Catch-22";
    final String author = "Joseph Heller";
    final int year = 1961;
    final int invalidYear = -1917;
    final String emptyTitle = "";
    final String emptyAuthor = "";
    
    CompactDisk cd;
    final String albumTitle = "A Night at the Opera";
    List<String> songs;
    final String artist = "Queen";
    final String song1 = "Bohemian Rhapsody";
    final String song2 = "Seaside Rendezvous";
    final String song3 = "'39";
    CompactDisk nullCD;
    /**
     * Default constructor for test class ItemTest
     */
    public ItemTest()
    {
        book = new Book(title, author, year);
        nullBook = new Book(emptyTitle, emptyAuthor, invalidYear);
        
        songs = new ArrayList<String>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        cd = new CompactDisk(title, songs, artist);
        ArrayList<String> empty = new ArrayList<String>();
        nullCD = new CompactDisk(null, empty, null);
        
        testerBook = new Item<Book>(book);
        nullTesterBook = new Item<Book>(nullBook);
        testerCD = new Item<CompactDisk>(cd);
        nullTesterCD = new Item<CompactDisk>(nullCD);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    // 3 normal test cases
    @Test
    public void testItemBookToString(){
        String expected = book.toString();
        String actual = testerBook.toString();
        
        assertEquals(expected, actual);
    }
    @Test
    public void testItemCDToString(){
        String expected = cd.toString();
        String actual = testerCD.toString();
        
        assertEquals(expected, actual);
    }
    @Test
    public void testGetItem(){
        String expected = book.getName();
        String actual = testerBook.getItem().getName();
        
        assertEquals(expected, actual);
    }
    
    // 3 edge test cases
    @Test
    public void testNullItemBookToString(){
        String expected = nullBook.toString();
        String actual = nullTesterBook.toString();
        
        assertEquals(expected, actual);
    }
    @Test
    public void testNullItemCDToString(){
        String expected = nullCD.toString();
        String actual = nullTesterCD.toString();
        
        assertEquals(expected, actual);
    }
    @Test
    public void testNullGetItem(){
        String expected = nullBook.getName();
        String actual = nullTesterBook.getItem().getName();
        
        assertEquals(expected, actual);
    }
}
