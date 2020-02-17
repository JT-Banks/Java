import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;

public class Asylum {
	static Timer time = new Timer();
	public static String user;
	actions act = new actions();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		game();
		System.out.println("Please state your name");
		user = in.next();
		System.out.println("Welcome " +user+ "! \nWhen you're ready to begin, just type !start");
		String start = in.findInLine("!start");
	}
	public void passages() {

		ArrayList <Integer> doors = new ArrayList<>();
		doors.add(1);
		doors.add(2);
		doors.add(3);
		doors.add(4);
		doors.add(5);
		doors.add(6);
		int staffLocker1 = 1;
		int staffLocker2 = 2;
		int staffLocker3 = 3;
		int janitorCloset = 4;
		}	
	public static void game() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("|*|*|*|*|*|*|*|*|*|*|*|");
		System.out.println("Welcome to the Asylum!");
		System.out.println("|*|*|*|*|*|*|*|*|*|*|*|");
		System.out.println();
		System.out.println("You have 6 minutes to complete this challenge.");
		System.out.println();
		System.out.println("Every room you enter will display"
							+ "a list of items of interest, to investigate items further simply type a '!' followed by the item name \nSuch as: !toolbox."
							+ " Once information is displayed, you can use this information to discover further clues, if you get stuck, at any time you can"
							+ "type '!return' to return to the intial room. From this room ONLY are hints available, once in the room, simply type"
							+ "'!hint'");
		System.out.println();
		int input = in.nextInt();
		switch(input) {
		case 1: 
		}
	}

}
