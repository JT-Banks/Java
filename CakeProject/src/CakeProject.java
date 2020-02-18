 public class CakeProject {

    
    public static void main(String[] args) {
        //Main method to call classes to provide information
        WeddingCake wedCk = new WeddingCake("chocolate", 3, 355.0, "Sarah", "John");
        wedCk.printInvoice();
        wedCk.printCard();
        
        System.out.println();
       //Placing a space
        BirthDayCake bdCk = new BirthDayCake("vanilla", 1, 20.0, "Alan", 15);
        bdCk.printInvoice();
        bdCk.printCard();
    }
    
}
