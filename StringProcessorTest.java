

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class StringProcessorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StringProcessorTest
{
    StringProcessor tester;
    String s1 = "test";
    String s2 = "1234";
    String s3 = "hello world";
    String e1 = "4321tset";
    String e2 = "tset";
    String e3 = "dlrow ollehdlrow olleh";
    String e4 = "llun";
    String n1 = "";
    String n2 = null;
    String n3 = "   ";
    /**
     * Default constructor for test class StringProcessorTest
     */
    public StringProcessorTest()
    {
        tester = new StringProcessor();
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
    
    @Test
    public void testCase1(){
        String expected = e2;
        String actual = tester.process(s1);        
        assertEquals(expected, actual);
    }
    @Test
    public void testCase2(){
        String expected = e1;
        String actual = tester.process(s1+s2);
        
        assertEquals(expected, actual);
    }    @Test
    public void testCase3(){
        String expected = e3;
        String actual = tester.process(s3+s3);
        
        assertEquals(expected, actual);
    }    @Test
    public void testCase4(){
        String expected = n1;
        String actual = tester.process(n1);
        
        assertEquals(expected, actual);
    }    @Test
    public void testCase5(){
        String expected = e4;
        String actual = tester.process(n2);
        
        assertEquals(expected, actual);
    }    @Test
    public void testCase6(){
        String expected = n3;
        String actual = tester.process(n3);
        
        assertEquals(expected, actual);
    }
}
