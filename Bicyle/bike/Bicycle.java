class Bicycle 
{
    public int gear;
    public int speed;
    public double price;
//Constructor
    public Bicycle(int gear, int speed, double price) {
        this.gear = gear;
        this.speed = speed;
        this.price = price;
    }
    
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
    
    public String info() {
        return("No of gears are "+gear
        +"\n"
        + "speed of bicycle is "+speed);
    } 
}
