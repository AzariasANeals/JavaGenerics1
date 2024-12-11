
/**
 * This is the Box<T> class. It will accept different T values (either number
 * values or Strings). There is also a printBox() method that will print out the
 * values of the Box.
 */
public class Box<T>
{
    private T value;
    
    public T setValue(T value){
        this.value = value;
        return value;
    }
    
    public T getValue(){
        return value;
    }
    
    public void printBox(){
        System.out.println(value);
    }
    
    public void printBox(T val){
        System.out.println(val);
    }
    
    public void printBox(Box<?> val){
        System.out.println(val);
    }
    
    public String toString(){
        return value.toString();
    }
}
