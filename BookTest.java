

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BookTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BookTest
{
    Book tester;
    Book nullTester;
    final String title = "Catch-22";
    final String author = "Joseph Heller";
    final int year = 1961;
    final int invalidYear = -1917;
    final String emptyTitle = "";
    final String emptyAuthor = "";
    /**
     * Default constructor for test class BookTest
     */
    public BookTest()
    {
        tester = new Book(title, author, year);
        nullTester = new Book(emptyTitle, emptyAuthor, invalidYear);
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
    public void testGetYear(){
        int expected = year;
        int actual = tester.getYear();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetName(){
        String expected = title;
        String actual = tester.getName();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetAuthor(){
        String expected = author;
        String actual = tester.getAuthor();
        assertEquals(expected, actual);
    }
    
    // 3 edge test cases
    @Test
    public void testEmptyGetName(){
        String expected = "";
        String actual = nullTester.getName();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEmptyGetAuthor(){
        String expected = "";
        String actual = nullTester.getAuthor();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testInvalidGetYear(){
        int expected = invalidYear;
        int actual = nullTester.getYear();
        
        assertEquals(expected, actual);
    }
}
