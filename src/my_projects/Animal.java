package my_projects;

public class Animal {
	
	// Data Members
	String species = "";
	String gender = "";
	String diet = "";
	
	
	// Default Constructor
	public Animal() {
		
		this.species = "Species TBD";
		this.gender = "Gender TBD";
		this.diet = "Diet TBD";
		
	}
	
	
	// Parameterized Constructor
	public Animal(String s, String g, String d) {
		
		this.species = s;
		this.gender = g;
		this.diet = d;
		
	}
	
	
	
	
	// SET METHODS:
	
	// setSpecies:
	public void setSpecies(String s) {
			
		this.species = s;
			
	}
		
	// setGender:
	public void setGender(String g) {
			
		this.gender = g;
			
	}

	// setDiet:
	public void setDiet(String d) {
		
		this.diet = d;
		
	}

	
	// GET METHODS:
	
	// getSpecies
	public String getSpecies() {
		
		return this.species;
		
	}
	
	// getGender:
	public String getGender() {
		
		return this.gender;
		
	}
	
	// getDiet:
	public String getDiet() {
		
		return this.diet;
		
	}
	
	
	// Override .toString() method
	@Override
	public String toString() {
			
		return super.toString() + " = " + this.species + " - " + this.gender + " - " + this.diet;
			
	}

}
