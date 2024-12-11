
/**
 * This is the Book class, it implements Titled. This allows you to create
 * books. 
 */
public class Book implements Titled
{
    private String title;
    private String author;
    private int year;
    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    
    public String getName(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public int getYear(){
        return year;
    }
    
    public String toString(){
        return "Title: " + title + "\n"
        + "Author: " + author + "\n" 
        + "Year: " + year + "\n\n";
    }
}
