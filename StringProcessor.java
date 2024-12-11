import java.lang.*;
/**
 * This is the StringProcessor class, it implements the Processor<T> interface.
 * It will take in a String and reverse it.
 */

public class StringProcessor implements Processor<String>
{
    
    public String process(String s){
        StringBuilder buf = new StringBuilder();
        buf.append(s);
        buf.reverse();
        
        return buf.toString();
    }
}
