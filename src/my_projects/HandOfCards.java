package my_projects;

import java.util.ArrayList;

public class HandOfCards {

	public static void main(String[] args) {
		
		int[] cardsArray = {6, 4, 3, 7, 1, 0, 2, 5};
		ArrayList<Integer> myArray = new ArrayList<Integer>();		
		for (int i=0; i<cardsArray.length; i++) {
			
			myArray.add(cardsArray[i]);
			
			
		}

	}
	
	public static ArrayList<Integer> sort(ArrayList<Integer> myArray) {
		
		if (myArray.size() == 1)
			return myArray;
		
		else {
			
			for (int i=0; i<myArray.size(); i++) {
				
				return myArray;
				
			}
		}
		
		return myArray;
	}

}
