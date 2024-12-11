
/**
 * This is the NumberBox<T> it will only accept number values.
 */
public class NumberBox<T extends Number> extends Box<T>
{
    public void printBox(NumberBox<? super Number> newValue){
         System.out.println(newValue);   
    }
}
