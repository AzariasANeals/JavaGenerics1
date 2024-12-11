import java.util.*;
/**
 * This is the Library class, it extends Item. It allows you
 * to create a Library and add items to it (Book and CompactDisk).
 */
public class Library<T extends Item>
{
    List<T> records;
    public static final int NOT_FOUND = -1;
    public Library(){
        records = new ArrayList<>();
    }
    
    public List<?> getRecords(){
        return records;
    }
    
    public void addRecord(T rec){
        records.add(rec);
    }
    
    public T findItem(String name){
        T buff = null;
        for(T r: records){
            if(((Titled)r.getItem()).getName().equals(name)){
                buff = r;
                break;
            }
        }
        return buff;
    }
    
    public int findItemIndex(String name){
        int index = NOT_FOUND;
        if(findItem(name) != null){
            for(int i = 0; i<records.size(); i++){
                if((((Titled)records.get(i).getItem()).getName().equals(name))){
                    index = i;
                }
            }
        }
        return index;
    }
    
    public void removeItem(String name){
        removeItem(findItemIndex(name));
    }
    
    public void removeItem(int index){
        if(index >= 0 && index <= records.size()){
            records.remove(index); 
        }
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(T r: records){
            sb.append(r);
        }
        return sb.toString();
    }
}
