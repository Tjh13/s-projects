package my_projects;

public class Vegetable {

	// data members
	String name;
	String type;
	String colour;
	
	// Parameterized constructor
	public Vegetable(String n, String t, String c) {
			
		this.name = n;
		this.type = t;
		this.colour = c;
			
	}
	
	@Override
	public String toString()  {
		
		String s = "";
		s = super.toString() + "." + this.name + "." + this.type + "." + this.colour;		
		return s;
	}
	
}
