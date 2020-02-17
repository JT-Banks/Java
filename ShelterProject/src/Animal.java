public class Animal implements Comparable<Animal> {
	//Private data members, least privilege
	private String kind;
	private double age;
	private String name;
	//Constructor passing variables
	public Animal (String name, String kind, double age) {
		this.age = age;
		this.kind = kind;
		this.name = name;
	}
	
	public String printInfo() {
		
		String s;
		if(age < 1) {
			age = age*12;
			s = age + " months";
		}
		
		else  {
			s = age + " years";
		}
			
		return String.format("%-7s %-11s %s\n", kind, s, name);
		
	}
	//Getters. Not necessary without setters, trying to develop good habits
	public String getKind() {
		return kind;
	}
	
	public double getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	public int compareTo(Animal other) {
		
		if(this.getKind().compareTo(other.getKind()) !=0)
			return kind.compareTo(other.kind);
					
		else if(Double.compare(this.getAge(), other.getAge()) != 0)
            return Double.compare(this.getAge(), other.getAge())*-1; 
            
        else
            return name.compareTo(other.name); 
	}
}

	

