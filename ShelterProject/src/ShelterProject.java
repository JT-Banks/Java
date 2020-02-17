public class ShelterProject {

	public static void main(String[] args) {
		
		//Variables for print format, to get exact spacing
		String k = "Kind";
		String a = "Age";
		String n = "Name";
		Shelter shltr = new Shelter("Pet Haven");
       
        //Format output
        System.out.println("Welcome to Pet Haven Shelter");
    	System.out.println("=============================");
    	System.out.printf("%-9s %-10s %s\n", k, a, n);
    	System.out.println("-----------------------------");
        shltr.addAnimal(new Animal(" Muffins", "Dog", 5));
        shltr.addAnimal(new Animal(" Charlie", "Cat", 1.5));
        shltr.addAnimal(new Animal(" Spot", "Rabbit", 3.5));
        shltr.addAnimal(new Animal(" Dexter", "Rabbit", 0.75));
        shltr.addAnimal(new Animal(" Bluex", "Dog", 0.5));
        shltr.listAnimals();
        System.out.print("-----------------------------");
	}

}
