import java.util.*;

/**
 * Write a description of class CompactDisk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CompactDisk implements Titled
{
    private String title;
    private List<String> songs;
    private String artist;
    
    public CompactDisk(String title, List<String> songs, String artist){
        this.songs = songs;
        this.title = title;
        this.artist = artist;
        
    }
    
    public String getName(){
        return title;
    }
    
    public List<String> getSongList(){
        return songs;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ");
        sb.append(title);
        sb.append("\nby " + artist);
        sb.append("\n");
        sb.append("Song List: \n");
        int songNumber = 1;
        for(String s : songs){
            sb.append(songNumber + ") " + s + "\n");
            songNumber++;
        }
        sb.append("\n");
        return sb.toString();
    }
}
