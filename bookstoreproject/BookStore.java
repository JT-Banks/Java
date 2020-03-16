package bookstoreproject;
import java.util.ArrayList;
import java.util.Collections;

    public class BookStore {
        
    private String name;
    private String address;
    private ArrayList <Book> books = new ArrayList<>();
    
        public BookStore(String name, String address)
        {
        //constructor
            this.name = name;
            this.address = address;
        }
        
        public void addBook(Book books)
        //Add book method
        {
            this.books.add(books);
        }
        public void sortBooks()
        //Sort method
        {
            Collections.sort(books);
        }
        public void listBooks ()
        //Not sure how to print the array correctly
        {
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        }
    }
