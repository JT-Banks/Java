
public class actions {

private String traverseDoor;
private String turnLeft;
private String turnRight;
private String turnAround;
private String walkUp;
private String walkLeft;
private String walkRight;
private String walkBack;
private String inspect;
private String interact;
private String firstRoom;
private double time = 45.0;
public actions () {
		
	this.traverseDoor = traverseDoor;
	this.turnLeft = turnLeft;
	this.turnRight = turnRight;
	this.turnAround = turnAround;
	this.walkUp = walkUp;
	this.walkLeft = walkLeft;
	this.walkRight = walkRight;
	this.walkBack = walkBack;
	this.inspect = inspect;
	this.interact = interact;
	this.firstRoom = firstRoom;
	
	}
	public void run(double time) {
		boolean run = true;
		if (run) {
			System.out.println("You ran away! \nThis docks time from your total time.");
			//time calc
		}
		
	}
	public void traverseDoor() {
		
	}
	public String getTraverseDoor() {
		return traverseDoor;
	}
	public void setTraverseDoor(String traverseDoor) {
		this.traverseDoor = traverseDoor;
	}
	public String getTurnLeft() {
		return turnLeft;
	}
	public void setTurnLeft(String turnLeft) {
		this.turnLeft = turnLeft;
	}
	public String getTurnRight() {
		return turnRight;
	}
	public void setTurnRight(String turnRight) {
		this.turnRight = turnRight;
	}
	public String getTurnAround() {
		return turnAround;
	}
	public void setTurnAround(String turnAround) {
		this.turnAround = turnAround;
	}
	public String getWalkUp() {
		return walkUp;
	}
	public void setWalkUp(String walkUp) {
		this.walkUp = walkUp;
	}
	public String getWalkLeft() {
		return walkLeft;
	}
	public void setWalkLeft(String walkLeft) {
		this.walkLeft = walkLeft;
	}
	public String getWalkRight() {
		return walkRight;
	}
	public void setWalkRight(String walkRight) {
		this.walkRight = walkRight;
	}
	public String getWalkBack() {
		return walkBack;
	}
	public void setWalkBack(String walkBack) {
		this.walkBack = walkBack;
	}
	public String getInspect() {
		return inspect;
	}
	public void setInspect(String inspect) {
		this.inspect = inspect;
	}
	public String getInteract() {
		return interact;
	}
	public void setInteract(String interact) {
		this.interact = interact;
	}
	public String getFirstRoom() {
		return firstRoom;
	}
	public void setFirstRoom(String firstRoom) {
		this.firstRoom = firstRoom;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
}
