
public class Hotel implements Comparable<Hotel> {
	
	private double price;
	private int stars;
	private int numOfRooms;
	
	public Hotel(int stars, int numOfRooms) {
		this.stars = stars;
		this.numOfRooms = numOfRooms;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int compareTo(Hotel other) {
		
		if(price < other.price)
			return -1;
		if(price == other.price)
			if(stars > other.stars)
				return 1;
			 if (stars < other.stars)
				return 0; 
		else
			return 1;
	
	}
	public static void main(String[] args) {
		

	
	}

}
