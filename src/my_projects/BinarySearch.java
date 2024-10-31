package my_projects;

public class BinarySearch {

	public static void main(String[] args) {
		
		// variable declarations
		int[] sortedIntArray = {0, 2, 3, 4, 7, 13, 17, 22};
	    String[] sortedStringArray = {"black", "blue", "brown", "green", "orange", "peach", "purple", "red", "salmon", "white"};

	    // processing
	    System.out.println(binaryIntSearch(sortedIntArray, 13));
	    System.out.println(binaryIntSearch(sortedIntArray, 73));
	    System.out.println(binaryStringSearch(sortedStringArray, "green"));
	    System.out.println(binaryStringSearch(sortedStringArray, "pink"));
	    System.out.println(binaryIntSearchRecursive(sortedIntArray, 17, 0, sortedIntArray.length - 1));
	    System.out.println(binaryIntSearchRecursive(sortedIntArray, 73, 0, sortedIntArray.length - 1));
	    System.out.println(binaryStringSearchRecursive(sortedStringArray, "black", 0, sortedStringArray.length - 1));
	    System.out.println(binaryStringSearchRecursive(sortedStringArray, "pink", 0, sortedStringArray.length - 1));

	}
	
	// DESCRIPTION - Returns array index of pattern if found, else -1.  Duplicates not handled.
	// PARAMETERS - int[] sortedIntArray, int intPattern 
	// RETURN TYPE - int
	public static int binaryIntSearch(int[] sortedIntArray, int intPattern)  {
	    
		// declare initial left, right, middle
		int left = 0;
		int right = sortedIntArray.length - 1; 
		int middle = right / 2;
	
		while (true) {
			
			// if int = middle value, return
			if (intPattern == sortedIntArray[middle]) {
				
				return middle;
				
			}
			
			// error case
			if (left > right) {
				
				return -1;
				
			}
			
			// if int < middle value, set right to just left of middle, set middle to average of left and right
			if (intPattern < sortedIntArray[middle]) {
				
				right = middle - 1;
				middle = (left + right) / 2;
				
			}
			
			// if int > middle value, set left to just right of middle, set middle to average of left and right
			else {
				
				left = middle + 1;
				middle = (right + left) / 2;
				
			}
			
		}
		
	
	}
	    
	    
	// DESCRIPTION - Returns array index of pattern if found, else -1.  Duplicates not handled.
	// PARAMETERS - String[] sortedStringArray, String stringPattern 
	// RETURN TYPE - int
	public static int binaryStringSearch(String[] sortedStringArray, String stringPattern)  {
	                    
		int left = 0;
		int right = sortedStringArray.length - 1; 
		int middle = right / 2;
		
		while (true) {
			
			// if string = middle string, return
			if (stringPattern.equals(sortedStringArray[middle])) {
				
				return middle;
				
			}
			
			// error case
			if (left > right) {
				
				return -1;
				
			}
			
			// if string < middle value, set right to just left of middle, set middle to average of left and right
			if (stringPattern.compareTo(sortedStringArray[middle]) < 0) {
				
				right = middle - 1;
				middle = (left + right) / 2;
				
			}
			
			// if string > middle value, set left to just right of middle, set middle to average of left and right
			else {
				
				left = middle + 1;
				middle = (right + left) / 2;
				
			}
			
		}

	}
	    
	    
	// DESCRIPTION - Returns array index of pattern if found, else -1.  Duplicates not handled.
	// PARAMETERS - int[] sortedIntArray, int intPattern, int left, int right
	// RETURN TYPE - int
	public static int binaryIntSearchRecursive(int[] sortedIntArray, int intPattern, int left, int right)  {
	          
		// set middle to average
		int middle = (left + right) / 2;
			
		// if int = middle value, return
		if (intPattern == sortedIntArray[middle]) {
				
			return middle;
				
		}
			
		// error case
		if (left > right) {
				
			return -1;
				
		}
		
		// if int < middle value, set right to just left of middle, set middle to average of left and right
		if (intPattern < sortedIntArray[middle]) {
				
			right = middle - 1;
			return binaryIntSearchRecursive(sortedIntArray, intPattern, left, right);
				
		}
			
		// if int > middle value, set left to just right of middle, set middle to average of left and right
		else {
				
			left = middle + 1;
			return binaryIntSearchRecursive(sortedIntArray, intPattern, left, right);
				
		}
			
	}
	    
	    
	// DESCRIPTION - Returns array index of pattern if found, else -1.  Duplicates not handled.
	// PARAMETERS - String[] sortedStringArray, String stringPattern, int left, int right
	// RETURN TYPE - int
	public static int binaryStringSearchRecursive(String[] sortedStringArray, String stringPattern, int left, int right)  {
	      
		// set middle to average
		int middle = (left + right) / 2;
		
		// if string = middle string, return
		if (stringPattern.equals(sortedStringArray[middle])) {
				
			return middle;
				
		}
			// error case
		if (left > right) {
				
			return -1;
				
		}
			
		// if string < middle value, set right to just left of middle, set middle to average of left and right
		if (stringPattern.compareTo(sortedStringArray[middle]) < 0) {
				
			right = middle - 1;
			return binaryStringSearchRecursive(sortedStringArray, stringPattern, left, right);
				
		}
		
		// if string > middle value, set left to just right of middle, set middle to average of left and right
		else {
				
			left = middle + 1;
			return binaryStringSearchRecursive(sortedStringArray, stringPattern, left, right);
				
		}
		
	}

}
