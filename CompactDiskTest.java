

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

/**
 * The test class CompactDiskTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompactDiskTest
{
    CompactDisk tester;
    final String title = "A Night at the Opera";
    List<String> songs;
    final String artist = "Queen";
    final String song1 = "Bohemian Rhapsody";
    final String song2 = "Seaside Rendezvous";
    final String song3 = "'39";
    
    CompactDisk nullTester;
    /**
     * Default constructor for test class CompactDiskTest
     */
    public CompactDiskTest()
    {
        songs = new ArrayList<String>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        tester = new CompactDisk(title, songs, artist);
        ArrayList<String> empty = new ArrayList<String>();
        nullTester = new CompactDisk(null, empty, null);
        
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
    public void testGetSongList(){
        int expected = 3;
        int actual = tester.getSongList().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetName(){
        String expected = title;
        String actual = tester.getName();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetArtist(){
        String expected = artist;
        String actual = tester.getArtist();
        assertEquals(expected, actual);
    }
    
    // 3 edge test cases
    @Test
    public void testNullGetName(){
        String expected = null;
        String actual = nullTester.getName();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNullGetArtist(){
        String expected = null;
        String actual = nullTester.getArtist();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetEmptySongList(){
        int expected = 0;
        int actual = nullTester.getSongList().size();
        
        assertEquals(expected, actual);
    }
}
