package bookstoreproject;
//Implementing comparable
public class Book implements Comparable <Book> {
    //Private data members
    private String title;
    private String author;
    private int edition;
    private double price;

    public Book(String title, String author, int edition, double price) 
    {
    //Constructor
    this.title = title;
    this.author = author;
    this.edition = edition;
    this.price = price;
    }
    
    public String getInfo()
    {
     //I'm not getting this to print correctly, so I couldn't format it 
       System.out.println("Title        Author      edition     price");
       System.out.println("------------------------------------------------------");
       return (String.format("%s%s%d%-10%f", title, author, edition, price));
      
       
    }
    //Override for compare to
    @Override
    public int compareTo (Book other) 
    //Comparing objects
        {
            return title.compareTo(other.title);
        }
}
