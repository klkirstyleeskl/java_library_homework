
import java.util.ArrayList;

public class Library {

    private String name;
    private int stock;
    private ArrayList<Book> books;

    public Library(String name, int stock){
        this.name = name;
        this.stock = stock;
        this.books = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }


}