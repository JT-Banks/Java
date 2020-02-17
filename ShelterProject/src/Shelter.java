import java.util.ArrayList;
import java.util.Collections;
public class Shelter {
	
	@SuppressWarnings("unused")
	private String shelterName;
	private ArrayList <Animal> shelterAnimal = new ArrayList<>();
	
	//Constructor passing private data member
	public Shelter(String shelterName) {
		
		this.shelterName = shelterName;
	}
	
	public void addAnimal(Animal a) {
	
    shelterAnimal.add(a);    
    
	}
	public void listAnimals() {
		
		Collections.sort(shelterAnimal);
	
		//enhance for-loop
		for(Animal a : shelterAnimal) 
		{
			System.out.print(a.printInfo());
		}
	}
}
