package my_projects;
import java.util.ArrayList;
import java.io.*;

public class VegetableSort {

	public static void main(String[] args) {
				
		Vegetable[] vegArray = loadVeggiesFromFile();

		System.out.println("\nUNSORTED: ");
		printVeggies(vegArray);
		
		sortVeggiesByName(vegArray, true);
		System.out.println("\nSORTED ASCENDING BY NAME: ");
		printVeggies(vegArray);
		
		sortVeggiesByName(vegArray, false);
		System.out.println("\nSORTED DESCENDING BY NAME: ");
		printVeggies(vegArray);
		
		sortVeggiesByType(vegArray, true);
		System.out.println("\nSORTED ASCENDING BY TYPE: ");
		printVeggies(vegArray);
		
		sortVeggiesByType(vegArray, false);
		System.out.println("\nSORTED DESCENDING BY TYPE: ");
		printVeggies(vegArray);
		
		sortVeggiesByColour(vegArray, true);
		System.out.println("\nSORTED ASCENDING BY COLOUR: ");
		printVeggies(vegArray);
		
		sortVeggiesByColour(vegArray, false);
		System.out.println("\nSORTED DESCENDING BY COLOUR: ");
		printVeggies(vegArray);
	}


	// DESCRIPTION - Loads Vegetable data from file
	// PARAMETERS - Requires "vegetables.txt" data file
	// RETURN TYPE - Vegetable[]
	public static Vegetable[] loadVeggiesFromFile()  {
		
		Vegetable[] vegArray = new Vegetable[18];
		String line = "";
		String myLine;
		int myInt;
		int arrayIndex = 0;
		BufferedReader br = null;
		ArrayList<String> linesList = new ArrayList<String>();
		
		// open file located under src folder, forced to use try-catch
		try {
			
			br = new BufferedReader(new FileReader("vegetables.txt"));
			
			// read contents of text file, line-by-line until end of file
			// add contents to ArrayList
			while ((line = br.readLine()) != null) {
				
				linesList.add(line);
				
			}
			
			br.close();
			
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		for (int i=0; i<linesList.size(); i++) {
			
			// create new name, type, and colour for each vegetable
			String name = "";
			String type = "";
			String colour = "";
			
			// declare variables
			myLine = linesList.get(i);
			myInt = 0;
			
			// repeat 3 times, once for name, once for type, once for colour
			for (int j=0; j<3; j++) {
				
				switch(j) {
				
				// differentiate between name, type, and colour cases
				// name:
				case 0:
					
					// while character added to string is not a comma, add character to string and repeat
					while (true) {
						
						if (myLine.charAt(myInt) == 44) {
							
							myInt += 2;
							break;
							
						}

						else {
							
							name = name + myLine.charAt(myInt);
							myInt++;
							
						}
						
					}
					
					break;
					
				
				// type:
				case 1:
					
					while (true) {
						
						if (myLine.charAt(myInt) == 44) {
							
							myInt += 2;
							break;
							
						}
						else {
							
							type = type + myLine.charAt(myInt);
							myInt++;
							
						}
						
					}
					
					break;
					
				// colour:	
				default:
					
					// set remainder of string to colour
					int temp = myInt;
					for (int k=0; k<(myLine.length() - temp); k++) {
						
						colour = colour + myLine.charAt(myInt);
						myInt++;
						
					}
						
					break;
					
				}
				
			}
			
			// create new vegetable using created variables
			Vegetable myVeg = new Vegetable(name, type, colour);
			vegArray[arrayIndex] = myVeg;
			arrayIndex++;
			
		}
		
		// return array
		return vegArray;
			
	}

	
	// DESCRIPTION - Sorts Vegetable array ascending (true) or descending (false) directions by name datamember.
	// PARAMETERS - Vegetable[] a, boolean ascending
	// RETURN TYPE - void
	public static void sortVeggiesByName(Vegetable[] a, boolean ascending)  {

		// check if order is to be ascending or not
		if (ascending == true) {
					
			boolean swapped = true;

			while (swapped == true)  {
						
				swapped = false;
					
				// code to keep passing, comparing and swapping
				for (int i=0; i<a.length-1; i++)  {
							
					// if string is later alphabetically, swap
					if (a[i].name.compareTo(a[i+1].name) > 0)  {
								
						swap(a, i, i+1);
						swapped = true;
				
					}
					
				}
				
			}
					
			
		}
				
		else {
					
			boolean swapped = true;

			while (swapped == true)  {
						
				swapped = false;
					
				// code to keep passing, comparing and swapping
				for (int i=0; i<a.length-1; i++)  {
							
					// if string is earlier alphabetically, swap
					if (a[i].name.compareTo(a[i+1].name) < 0)  {
								
								swap(a, i, i+1);
								swapped = true;
					}
				
				}
			
			}
				
		}
		
	}
	
	
	// DESCRIPTION - Sorts Vegetable array ascending (true) or descending (false) directions by type datamember.
	// PARAMETERS - Vegetable[] a, boolean ascending
	// RETURN TYPE - void
	public static void sortVeggiesByType(Vegetable[] a, boolean ascending)  {
		
		// check if order is to be ascending or not
		if (ascending == true) {
							
			boolean swapped = true;

			while (swapped == true)  {
								
				swapped = false;
							
				// code to keep passing, comparing and swapping
				for (int i=0; i<a.length-1; i++)  {
									
					// if string is later alphabetically, swap
					if (a[i].type.compareTo(a[i+1].type) > 0)  {
										
						swap(a, i, i+1);
						swapped = true;
						
					}
							
				}
						
			}						
					
		}
						
		else {
							
			boolean swapped = true;

			while (swapped == true)  {
			
				swapped = false;
							
				// code to keep passing, comparing and swapping
				for (int i=0; i<a.length-1; i++)  {
									
					// if string is earlier alphabetically, swap
					if (a[i].type.compareTo(a[i+1].type) < 0)  {
										
								swap(a, i, i+1);
								swapped = true;
		
					}
					
				}
				
			}
						
		}
		
	}
	
	
	// DESCRIPTION - Sorts Vegetable array ascending (true) or descending (false) directions by colour datamember.
	// PARAMETERS - Vegetable[] a, boolean ascending
	// RETURN TYPE - void
	public static void sortVeggiesByColour(Vegetable[] a, boolean ascending)  {
		
		// check if order is to be ascending or not
		if (ascending == true) {
									
			boolean swapped = true;

			while (swapped == true)  {
										
				swapped = false;
									
				// code to keep passing, comparing and swapping
				for (int i=0; i<a.length-1; i++)  {
											
					// if string is later alphabetically, swap
					if (a[i].colour.compareTo(a[i+1].colour) > 0)  {
												
						swap(a, i, i+1);
						swapped = true;
								
					}
									
				}
								
			}						
							
		}
								
		else {
									
			boolean swapped = true;

			while (swapped == true)  {
					
				swapped = false;
									
				// code to keep passing, comparing and swapping
				for (int i=0; i<a.length-1; i++)  {
											
					// if string is earlier alphabetically, swap
					if (a[i].colour.compareTo(a[i+1].colour) < 0)  {
												
								swap(a, i, i+1);
								swapped = true;
				
					}
							
				}
						
			}
								
		}
		
	}
	
	
	// DESCRIPTION - Swaps Vegetable array elements x with y.
	// PARAMETERS - Vegetable[] a, int x, int y
	// RETURN TYPE - void
	public static void swap(Vegetable[] a, int x, int y)  {
		
		Vegetable temp = a[x];
		a[x] = a[y];
		a[y] = temp;

	}
	
	
	// DESCRIPTION - Prints array of Vegetable objects.
	// PARAMETERS - Vegetable[] a
	// RETURN TYPE - void
	public static void printVeggies(Vegetable[] a)  {
		
		for (int i=0; i<a.length; i++) {
			
			System.out.println(a[i].toString());
			
		}
	
	}
	
}


/* EXPECTED OUTPUT (Hashcodes will vary, for example "@4926097b").

UNSORTED: 
assignments.Vegetable@4926097b.lettuce.leafy green.green
assignments.Vegetable@762efe5d.spinach.leafy green.green
assignments.Vegetable@5d22bbb7.silverbeet.leafy green.green
assignments.Vegetable@41a4555e.cabbage.cruciferous.green
assignments.Vegetable@3830f1c0.cauliflower.cruciferous.white
assignments.Vegetable@39ed3c8d.brussels sprouts.cruciferous.green
assignments.Vegetable@71dac704.broccoli.cruciferous.green
assignments.Vegetable@123772c4.pumpkin.marrow.orange
assignments.Vegetable@2d363fb3.cucumber.marrow.green
assignments.Vegetable@7d6f77cc.zucchini.marrow.green
assignments.Vegetable@5aaa6d82.potato.brown.root
assignments.Vegetable@73a28541.sweet potato.orange.root
assignments.Vegetable@6f75e721.yam.pink.root
assignments.Vegetable@69222c14.celery.perennial.green 
assignments.Vegetable@606d8acf.asparagus.aromatic.green
assignments.Vegetable@782830e.onion.allium.yellow
assignments.Vegetable@470e2030.garlic.allium.white
assignments.Vegetable@3fb4f649.shallot.allium.green

SORTED ASCENDING BY NAME: 
assignments.Vegetable@606d8acf.asparagus.aromatic.green
assignments.Vegetable@71dac704.broccoli.cruciferous.green
assignments.Vegetable@39ed3c8d.brussels sprouts.cruciferous.green
assignments.Vegetable@41a4555e.cabbage.cruciferous.green
assignments.Vegetable@3830f1c0.cauliflower.cruciferous.white
assignments.Vegetable@69222c14.celery.perennial.green 
assignments.Vegetable@2d363fb3.cucumber.marrow.green
assignments.Vegetable@470e2030.garlic.allium.white
assignments.Vegetable@4926097b.lettuce.leafy green.green
assignments.Vegetable@782830e.onion.allium.yellow
assignments.Vegetable@5aaa6d82.potato.brown.root
assignments.Vegetable@123772c4.pumpkin.marrow.orange
assignments.Vegetable@3fb4f649.shallot.allium.green
assignments.Vegetable@5d22bbb7.silverbeet.leafy green.green
assignments.Vegetable@762efe5d.spinach.leafy green.green
assignments.Vegetable@73a28541.sweet potato.orange.root
assignments.Vegetable@6f75e721.yam.pink.root
assignments.Vegetable@7d6f77cc.zucchini.marrow.green

SORTED DESCENDING BY NAME: 
assignments.Vegetable@7d6f77cc.zucchini.marrow.green
assignments.Vegetable@6f75e721.yam.pink.root
assignments.Vegetable@73a28541.sweet potato.orange.root
assignments.Vegetable@762efe5d.spinach.leafy green.green
assignments.Vegetable@5d22bbb7.silverbeet.leafy green.green
assignments.Vegetable@3fb4f649.shallot.allium.green
assignments.Vegetable@123772c4.pumpkin.marrow.orange
assignments.Vegetable@5aaa6d82.potato.brown.root
assignments.Vegetable@782830e.onion.allium.yellow
assignments.Vegetable@4926097b.lettuce.leafy green.green
assignments.Vegetable@470e2030.garlic.allium.white
assignments.Vegetable@2d363fb3.cucumber.marrow.green
assignments.Vegetable@69222c14.celery.perennial.green 
assignments.Vegetable@3830f1c0.cauliflower.cruciferous.white
assignments.Vegetable@41a4555e.cabbage.cruciferous.green
assignments.Vegetable@39ed3c8d.brussels sprouts.cruciferous.green
assignments.Vegetable@71dac704.broccoli.cruciferous.green
assignments.Vegetable@606d8acf.asparagus.aromatic.green

SORTED ASCENDING BY TYPE: 
assignments.Vegetable@3fb4f649.shallot.allium.green
assignments.Vegetable@782830e.onion.allium.yellow
assignments.Vegetable@470e2030.garlic.allium.white
assignments.Vegetable@606d8acf.asparagus.aromatic.green
assignments.Vegetable@5aaa6d82.potato.brown.root
assignments.Vegetable@3830f1c0.cauliflower.cruciferous.white
assignments.Vegetable@41a4555e.cabbage.cruciferous.green
assignments.Vegetable@39ed3c8d.brussels sprouts.cruciferous.green
assignments.Vegetable@71dac704.broccoli.cruciferous.green
assignments.Vegetable@762efe5d.spinach.leafy green.green
assignments.Vegetable@5d22bbb7.silverbeet.leafy green.green
assignments.Vegetable@4926097b.lettuce.leafy green.green
assignments.Vegetable@7d6f77cc.zucchini.marrow.green
assignments.Vegetable@123772c4.pumpkin.marrow.orange
assignments.Vegetable@2d363fb3.cucumber.marrow.green
assignments.Vegetable@73a28541.sweet potato.orange.root
assignments.Vegetable@69222c14.celery.perennial.green 
assignments.Vegetable@6f75e721.yam.pink.root

SORTED DESCENDING BY TYPE: 
assignments.Vegetable@6f75e721.yam.pink.root
assignments.Vegetable@69222c14.celery.perennial.green 
assignments.Vegetable@73a28541.sweet potato.orange.root
assignments.Vegetable@7d6f77cc.zucchini.marrow.green
assignments.Vegetable@123772c4.pumpkin.marrow.orange
assignments.Vegetable@2d363fb3.cucumber.marrow.green
assignments.Vegetable@762efe5d.spinach.leafy green.green
assignments.Vegetable@5d22bbb7.silverbeet.leafy green.green
assignments.Vegetable@4926097b.lettuce.leafy green.green
assignments.Vegetable@3830f1c0.cauliflower.cruciferous.white
assignments.Vegetable@41a4555e.cabbage.cruciferous.green
assignments.Vegetable@39ed3c8d.brussels sprouts.cruciferous.green
assignments.Vegetable@71dac704.broccoli.cruciferous.green
assignments.Vegetable@5aaa6d82.potato.brown.root
assignments.Vegetable@606d8acf.asparagus.aromatic.green
assignments.Vegetable@3fb4f649.shallot.allium.green
assignments.Vegetable@782830e.onion.allium.yellow
assignments.Vegetable@470e2030.garlic.allium.white

SORTED ASCENDING BY COLOUR: 
assignments.Vegetable@7d6f77cc.zucchini.marrow.green
assignments.Vegetable@2d363fb3.cucumber.marrow.green
assignments.Vegetable@762efe5d.spinach.leafy green.green
assignments.Vegetable@5d22bbb7.silverbeet.leafy green.green
assignments.Vegetable@4926097b.lettuce.leafy green.green
assignments.Vegetable@41a4555e.cabbage.cruciferous.green
assignments.Vegetable@39ed3c8d.brussels sprouts.cruciferous.green
assignments.Vegetable@71dac704.broccoli.cruciferous.green
assignments.Vegetable@606d8acf.asparagus.aromatic.green
assignments.Vegetable@3fb4f649.shallot.allium.green
assignments.Vegetable@69222c14.celery.perennial.green 
assignments.Vegetable@123772c4.pumpkin.marrow.orange
assignments.Vegetable@6f75e721.yam.pink.root
assignments.Vegetable@73a28541.sweet potato.orange.root
assignments.Vegetable@5aaa6d82.potato.brown.root
assignments.Vegetable@3830f1c0.cauliflower.cruciferous.white
assignments.Vegetable@470e2030.garlic.allium.white
assignments.Vegetable@782830e.onion.allium.yellow

SORTED DESCENDING BY COLOUR: 
assignments.Vegetable@782830e.onion.allium.yellow
assignments.Vegetable@3830f1c0.cauliflower.cruciferous.white
assignments.Vegetable@470e2030.garlic.allium.white
assignments.Vegetable@6f75e721.yam.pink.root
assignments.Vegetable@73a28541.sweet potato.orange.root
assignments.Vegetable@5aaa6d82.potato.brown.root
assignments.Vegetable@123772c4.pumpkin.marrow.orange
assignments.Vegetable@69222c14.celery.perennial.green 
assignments.Vegetable@7d6f77cc.zucchini.marrow.green
assignments.Vegetable@2d363fb3.cucumber.marrow.green
assignments.Vegetable@762efe5d.spinach.leafy green.green
assignments.Vegetable@5d22bbb7.silverbeet.leafy green.green
assignments.Vegetable@4926097b.lettuce.leafy green.green
assignments.Vegetable@41a4555e.cabbage.cruciferous.green
assignments.Vegetable@39ed3c8d.brussels sprouts.cruciferous.green
assignments.Vegetable@71dac704.broccoli.cruciferous.green
assignments.Vegetable@606d8acf.asparagus.aromatic.green
assignments.Vegetable@3fb4f649.shallot.allium.green

*/
