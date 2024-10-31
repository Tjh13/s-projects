package my_projects;

public class AnimalTest {

	public static void main(String[] args) {

		// Use parameterized constructor to create new Animal
		Animal animal1 = new Animal("Canis lupus", "Female", "Carnivore");

		System.out.println(animal1);
		
		// Use default constructor to create new Animal
		Animal animal2 = new Animal();
		System.out.println(animal2.getSpecies());
		System.out.println(animal2.getGender());
		System.out.println(animal2.getDiet());
		
		// Create new animal and set data for it
		Animal animal3 = new Animal();
		animal3.setSpecies("Gekko gecko");
		animal3.setGender("Male");
		animal3.setDiet("Carnivore");
		
		System.out.println(animal3);
		
	}

}
