public class BirthDayCake extends Cake {
    //private data members
    private String firstName;
    private int age;
    
    public BirthDayCake (String flavor, int tiers, double price, String firstName, int age)
            {
                //invoking the parent class
                super(flavor, tiers, price);
                //pointing cursor to data members to change values
                this.firstName = firstName;
                this.age = age;
            }
    @Override
    public void printCard()
    {
        //Method to override the general thank you card
        System.out.println("Happy Birthday to "+firstName+"! You just turned " +age+ " :)");
        //By calling the parent class, we over-rode the original print card, here we replace it
        super.printCard();
    }
}
