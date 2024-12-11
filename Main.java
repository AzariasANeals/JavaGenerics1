import java.util.*;

/**
 * This is the Main class. Here we will demonstrate the 
 * value of Box and Java generics. 
 */
public class Main
{
    public static void main(String[] args){
        /*
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(10);
        System.out.println(integerBox.getValue());
        
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello");
        System.out.println(stringBox.getValue());
        
        stringBox.printBox();
        
        integerBox.printBox(4);
        stringBox.printBox("World");
        integerBox.printBox(stringBox);
        */
       
       /*
        NumberBox<Integer> numInt = new NumberBox<>();
        numInt.setValue(15);
        numInt.printBox(15);
        
        NumberBox<Float> numFloat = new NumberBox<>();
        numFloat.setValue(3.5f);
        numFloat.printBox(3.8f);
        
        NumberBox<Double> numDouble = new NumberBox<>();
        numDouble.setValue(20.5);
        numDouble.printBox(22.5);
        
        System.out.println(numDouble);
        //NumberBox<String> numString = new NumberBox<>();
       
       
        StringProcessor pro = new StringProcessor();
        System.out.println(pro.process("xelA"));
        */ 
       // numDouble.printBox(numInt);
        
       
       
        Book b1 = new Book("Catch-22", "Joseph Heller", 1941);
        Book b2 = new Book("Oliver Twist", "Charles Dickens", 1835); 
        Book b3 = new Book("The Martian", "Andy Weir", 2020);
        List<String> songList = new ArrayList<>();
        songList.add("Piano Man");
        songList.add("Uptown Girl");
        songList.add("The Stranger");
        
        CompactDisk cd = new CompactDisk("Piano Man", songList, "Billy Joel");
        Item<Book> book = new Item<Book>(b1);
        Item<CompactDisk> myCD = new Item<CompactDisk>(cd);
        Item<Book> book2 = new Item<Book>(b2);
        Item<Book> book3 = new Item<Book>(b3);
        Library<Item> lib = new Library<>();
        lib.addRecord(book);
        lib.addRecord(myCD);
        lib.addRecord(book2);
        lib.addRecord(book3);
        Item<?> found = lib.findItem("Piano Man");
        Item<?> found2 = lib.findItem("Piano Men");
        
        /*
        System.out.println(lib);
        lib.removeItem("Catch-22");
        System.out.println(lib);
        lib.removeItem(1);
        System.out.println(lib);
        */
        
        
        System.out.println(found);
        System.out.println(found2);
        
    }
}
