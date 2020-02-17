import java.util.Scanner;
public class Interactive {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = "John", heshe= "";
		int age = 50, retirement = 70, daysTill=0;
		double gpa = 3.5;
		boolean isFemale;
		
		System.out.println("Enter Student's name.");
		name = in.nextLine();
		System.out.println("Enter student's GPA.");
		gpa = in.nextDouble();
		System.out.println("Enter student's age.");
		age = in.nextInt();
		System.out.println("Are you female? (true/false)");
		isFemale = in.hasNextBoolean();
		heshe = isFemale ? "He" : "She";
		daysTill = retirement - age;
		
		System.out.printf("%s is %d years old (%d years to retirement) . %s has a %4.1f gpa.\n", 
		name, age, daysTill, heshe, gpa);

	}

}
