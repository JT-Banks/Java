package bike;


public class Bike {


    public static void main(String[] args) {
        
        MountainBike bike1 = new MountainBike(5, 10, 50.5, 12);
        MountainBike bike2 = new MountainBike(6, 12, 70.5, 10);
        
        System.out.println(bike1.info());
        System.out.println(bike2.info());
        
        if(bike1.compareTo(bike2) == -1)
            System.out.println("Bike1 is cheaper");
                    
    }
    
}
