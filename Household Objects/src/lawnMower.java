import java.util.Scanner;

public class lawnMower {

	Scanner in = new Scanner(System.in);
	private int height;
	private int autoSpeed;
	private String barExtend = "The bar is now extended!";
	private String barRetract = "The bar is now retracted!";
	private String on = "Lawn mower is now on";
	private String off = "Lawn mower is now off";
	private int battery = 0;
	
	public static void main(String[] args) {
		

	}

	public lawnMower(int height, int autoSpeed, String barExtend, String barRetract, String on, String off, int battery) {
		
		this.height = height;
		this.autoSpeed = autoSpeed;
		this.barExtend = barExtend;
		this.barRetract = barRetract;
		this.on = on;
		this.off = off;
		this.battery = battery;
		
	}
		public void setHeight(int height) {
			
			System.out.println("Please set the height of the blade");
			height = in.nextInt();
		}
		
		public void setSpeed(int autoSpeed) {
			
			System.out.println("Please select the auto speed");
			autoSpeed = in.nextInt();
		}
}
