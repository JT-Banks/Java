public class Car {   
    //Declaring private variables
    private long vin;
    private String model;
    private int year;
    private double mileage; 
    //Default Constructor that is empty and doesn't return anything
    public Car(){ 
    }
    //Constructor for VIN number, model, and year
    public Car (long vinNum, int yearC, String modelC) {
        //Setting individual values for specific cars
        vin = vinNum;
        model = modelC;
        year = yearC;  
    }
    public void setMileage(double Mileage) {
       //Method to set mileage, which should be changeable, and not private
       mileage = Mileage;
    }
    //Method to get info
    public String getInfo() {
        
        return year+" "+ model + " "+ "(VIN: " + vin + ", mileage: "+ mileage +" miles)";
    }
}

