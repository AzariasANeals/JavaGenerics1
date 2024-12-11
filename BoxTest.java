
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BoxTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BoxTest
{
    Box<String> tester;
    final String str1 = "Hello World";
    final String str2 = "";

    /**
     * Default constructor for test class BoxTest
     */
    public BoxTest()
    {

    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        tester = new Box<String>();
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
    public void testGetValue(){
        String expected = str1;
        String actual = str2;
        tester.setValue(str1);
        actual = tester.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetValue(){
        String expected = str1;
        String actual = str2;
        tester.setValue(str1);
        actual = tester.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString(){
        String expected = str1;
        String actual = str2;
        tester.setValue(str1);
        actual = tester.toString();
        assertEquals(expected, actual);
    }
    // 3 edge test cases
    @Test
    public void testEmptyGetValue(){
        String expected = str2;
        String actual = str1;
        tester.setValue(str2);
        actual = tester.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptySetValue(){
        String expected = str2;
        String actual = str1;
        tester.setValue(str2);
        actual = tester.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyToString(){
        String expected = str2;
        String actual = str1;
        tester.setValue(str2);
        actual = tester.toString();
        assertEquals(expected, actual);
    }
}
