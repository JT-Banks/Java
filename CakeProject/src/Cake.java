import java.time.LocalDate;

public class Cake {
    //Declaring variables private for security
    private String flavor;
    private int tiers;
    private double price;
    

    public Cake(String flavor, int tiers, double price)
    {
        //Cursor needs to point to private data members to change them without giving access to the User.
        this.flavor = flavor;
        this.tiers = tiers;
        this.price = price;
    }
    public void printInvoice()
    {
    	LocalDate time = java.time.LocalDate.now();
        System.out.printf("A %d tier %s cake. The price is $%.2f Issued on: %s\n",tiers, flavor, price, time );
    }
    public void printCard()
    {
        System.out.println("Thank you for choosing us!");
    }
}

