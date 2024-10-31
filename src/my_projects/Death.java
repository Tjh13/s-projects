package my_projects;

public class Death {
	
	// data members
	String date;
	String place;
	String age;
		
	// Parameterized constructor
	public Death(String d, String p, String a) {
			
		this.date = d;
		this.place = p;
		this.age = a;
				
	}
		
	@Override
	public String toString()  {
			
		String s = "";
		s = super.toString() + "." + this.date + "." + this.place + "." + this.age;		
		return s;

	}

}
