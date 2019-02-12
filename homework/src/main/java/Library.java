
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

    public int getInitialStockValue(){
        return this.books.size();
    }

    public int addBook(Book book) {
        this.books.add(book);
        return this.books.size();

    }


}