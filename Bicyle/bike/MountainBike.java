package bike;


class MountainBike extends Bicycle implements Comparable<MountainBike> 
{
    public int seatHeight;

    public MountainBike(int gear, int speed, double price, int seatHeight)
    {
        super(gear, speed, price);
        this.seatHeight = seatHeight;
    } 

    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    } 

    public double getPrice()
    {
        return price; 
    } 

    @Override 
    public String info()
    {
        return (super.info()+ "\nseat height is "+seatHeight);
    }

    @Override
    public int compareTo(MountainBike other)
    {
        if(this.price == other.price)
            return 0; 
        else if(this.price < other.price)
            return -1; 
        else 
            return 1; 
    }

}

