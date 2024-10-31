package my_projects;

public class Bowling {
	
	// data members
	protected int pinsLeft;
	protected long pinsHit;
	
	// DESCRIPTION: default constructor
	// PARAMETER LIST: double pinsLeft, double pinsHit, int throwNum
	// RETURN TYPE: Bowling		
	public Bowling() {
				
			this.pinsLeft = 10;
			this.pinsHit = 0;
				
		}
	
	// DESCRIPTION: parameterized constructor
	// PARAMETER LIST: double pinsLeft, double pinsHit, int throwNum
	// RETURN TYPE: Bowling		
	public Bowling(int pl, long ph) {
			
		this.pinsLeft = pl;
		this.pinsHit = ph;
			
	}
	
		
	// SET METHODS:
		
	// setPinsHit
	public void setPinsHit(int ph) {
					
		this.pinsHit = ph;
					
	}
	
	// setPinsLeft
	public void setPinsLeft(int pl) {
						
		this.pinsLeft = pl;
						
	}	
	
	
	
	// GET METHODS:
		
	// getPinsHit
	public double getPinsHit() {
						
		return this.pinsHit;
						
	}
	
	// getPinsLeft
	public double getPinsLeft() {
						
		return this.pinsLeft;
						
	}	
	

}
