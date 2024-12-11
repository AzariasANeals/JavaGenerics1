
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

/**
 * The test class LibraryTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LibraryTest
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

    Library<Item> tester;
    /**
     * Default constructor for test class LibraryTest
     */
    public LibraryTest()
    {
        book = new Book(title, author, year);
        nullBook = new Book(emptyTitle, emptyAuthor, invalidYear);

        songs = new ArrayList<String>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        cd = new CompactDisk(albumTitle, songs, artist);
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
        tester = new Library<Item>();
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
    public void testAddOneRecord(){
        int expected = 1;
        tester.addRecord(testerBook);
        int actual = tester.getRecords().size();
        
        assertEquals(expected, actual);
    }
    @Test
    public void testAddTwoRecord(){
        int expected = 2;
        tester.addRecord(testerBook);
        tester.addRecord(testerCD);
        int actual = tester.getRecords().size();
        
        assertEquals(expected, actual);
    }
    @Test
    public void testRemoveItem(){
        int expected = 1;
        tester.addRecord(testerBook);
        tester.addRecord(testerCD);
        tester.removeItem(title);
        int actual = tester.getRecords().size();
        
        assertEquals(expected, actual);
    }
    
    // 3 edge test cases
    @Test
    public void testEmptyLibraryGetRecords(){
        int expected = 0;
        int actual = tester.getRecords().size();
        
        assertEquals(expected, actual);
    }
    @Test
    public void testFindItemIndexNotFound(){
        int expected = Library.NOT_FOUND;
        int actual = tester.findItemIndex(title);
        
        assertEquals(expected, actual);
    }
    @Test
    public void testRemoveItemDoesNotExist(){
        int expected = 1;
        tester.addRecord(testerCD);
        tester.removeItem(title);
        int actual = tester.getRecords().size();
        
        assertEquals(expected, actual);        
    }
    
}
