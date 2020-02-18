public class WeddingCake extends Cake {
//Making data members private for security reasons
private String bridesFirstName;
private String groomsFirstName;


public WeddingCake (String flavor, int tiers, double price, String bridesFirstName, String groomsFirstName) 
{
 
	//Invoking the parent(father) class, and pointing the cursor to data types
    super(flavor, tiers, price);
    this.bridesFirstName = bridesFirstName;
    this.groomsFirstName = groomsFirstName;
}
@Override
     public void printCard() 
    {
        //Method to override the general thank you card
        System.out.println("Happy Wedding to " +bridesFirstName+ " and " +groomsFirstName +"!");
        //By invoking the parent we replace what we overrode to still print what is needed
        super.printCard();
    }

}

