
/**
 * This is the Item class.
 */
public class Item<T extends Titled>
{
    private T item;
    
    public Item(T item){
        this.item = item;
    }
    
    public T getItem(){
        return item;
    }
    
    public String toString(){
        return item.toString();
    }
}
