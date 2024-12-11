
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class NumberBoxTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NumberBoxTest
{
    NumberBox<Integer> tester;
    final int i1 = 10;
    final int i2 = 9;
    final String str1 = "10";
    final String str2 = "";

    /**
     * Default constructor for test class NumberBoxTest
     */
    public NumberBoxTest()
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
        tester = new NumberBox<Integer>();
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
        int expected = i1;
        int actual = 0;
        tester.setValue(i1);
        actual = tester.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetValue(){
        int expected = i1;
        int actual = 0;
        tester.setValue(i1);
        actual = tester.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString(){
        String expected = str1;
        String actual = str2;
        tester.setValue(i1);
        actual = tester.toString();
        assertEquals(expected, actual);
    }
    // 3 edge test cases
    @Test
    public void testEmptyGetValue(){
        boolean expected = true;
        boolean actual = false;
        int junk;
        
        try{
            tester.setValue(null);
            junk = tester.getValue();
        }
        catch(NullPointerException n){
            actual = true;
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptySetValue(){
        boolean expected = true;
        boolean actual = false;
        String junk;
        
        try{
            tester.setValue(null);
            junk = tester.toString();
        }
        catch(NullPointerException n){
            actual = true;
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyToString(){
        boolean expected = true;
        boolean actual = false;
        String junk;
        try{
            tester.setValue(null);
            junk = tester.toString();
        }
        catch(NullPointerException n){
            actual = true;
        }
        assertEquals(expected, actual);
    }
}
