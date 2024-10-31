package my_projects;

public class BubbleSort {

	public static void main(String[] args) {
		
		// variables
		int[] intArray = {6, 4, 7, 0, 1, 2, 9, 8, 5};
		String[] stringArray = {"cat", "horse", "mouse", "chicken", "dog", "fish", "snake", "cow"};
		int myInt = 0;
			
		// bubble sort int array ascending, non recursively
		bubbleSortIntegers(intArray, true);
		printIntArray(intArray);

		// bubble sort int array descending, non recursively
		bubbleSortIntegers(intArray, false);
		printIntArray(intArray);
				
		// bubble sort int array ascending, recursively
		intArray = bubbleSortIntegersRecursive(intArray, true);
		printIntArray(intArray);
				
		// bubble sort int array descending, recursively
		intArray = bubbleSortIntegersRecursive(intArray, false);
		printIntArray(intArray);
				
		// bubble sort String array ascending, non recursively
		bubbleSortStrings(stringArray, true);
		printStringArray(stringArray);
				
		// bubble sort String array descending, non recursively
		bubbleSortStrings(stringArray, false);
		printStringArray(stringArray);
				
		// bubble sort String array ascending, recursively
		stringArray = bubbleSortStringsRecursive(stringArray, true);
		printStringArray(stringArray);
				
		// bubble sort String array descending, recursively
		stringArray = bubbleSortStringsRecursive(stringArray, false);
		printStringArray(stringArray);
			
		/*  EXPECTED OUTPUT:
				 
		    0 1 2 4 5 6 7 8 9 
			9 8 7 6 5 4 2 1 0 
			0 1 2 4 5 6 7 8 9 
			9 8 7 6 5 4 2 1 0 
			cat chicken cow dog fish horse mouse snake 
			snake mouse horse fish dog cow chicken cat 
			cat chicken cow dog fish horse mouse snake 
			snake mouse horse fish dog cow chicken cat 
				 
		 */
				
	}

			
	// DESCRIPTION - Sorts integer array ascending (true) or descending (false) directions
	// PARAMETERS - int[] a, boolean ascending
	// RETURN TYPE - void
	public static void bubbleSortIntegers(int[] a, boolean ascending)  {
		
		// check if order is to be ascending or not
		if (ascending == true) {
			
			boolean swapped = true;

			while (swapped == true)  {
				
				swapped = false;
			
				// code to keep passing, comparing and swapping
				for (int i=0; i<a.length-1; i++)  {
					
					// if number is more, swap
					if (a[i] > a[i+1])  {
						
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
					
					// if number is less, swap
					if (a[i] < a[i+1])  {
						
						swap(a, i, i+1);
						swapped = true;
					}
				}
			}
			
		}
		
	}
			
			
	// DESCRIPTION - Sorts integer array ascending (true) or descending (false) directions, recursively.
	// PARAMETERS - int[] a, boolean ascending
	// RETURN TYPE - void
		
	public static int[] bubbleSortIntegersRecursive(int[] a, boolean ascending)  {
			
		boolean swapped = true;
		
		// check if order is to be ascending or not
		if (ascending == true) {

			swapped = false;
			
			for (int i=0; i<a.length-1; i++)  {
			
				// if number is more, swap
				if (a[i] > a[i + 1]) {
					
					swap(a, i, i+1);
					swapped = true;
					
				}
				
			}
			
			if (swapped == true) {
				
				return bubbleSortIntegersRecursive(a, ascending);
				
			}
			
			else 
				return a;

			
		}
		
		else {
			
			swapped = false;
			
			for (int i=0; i<a.length-1; i++)  {
			
				// if number is less, swap
				if (a[i] < a[i + 1]) {
					
					swap(a, i, i+1);
					swapped = true;
					
				}
				
			}
			// if anything was swapped, repeat function
			if (swapped == true) {
				
				return bubbleSortIntegersRecursive(a, ascending);
				
			}
			
			else 
				return a;

			
		}
					
	}
			
			
	// DESCRIPTION - Sorts String array ascending (true) or descending (false) directions
	// PARAMETERS - String[] a, boolean ascending
	// RETURN TYPE - void
	public static void bubbleSortStrings(String[] a, boolean ascending)  {
				
		// check if order is to be ascending or not
		if (ascending == true) {
			
			boolean swapped = true;

			while (swapped == true)  {
				
				swapped = false;
			
				// code to keep passing, comparing and swapping
				for (int i=0; i<a.length-1; i++)  {
					
					// if string is later alphabetically, swap
					if (a[i].compareTo(a[i+1]) > 0)  {
						
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
					if (a[i].compareTo(a[i+1]) < 0)  {
						
						swap(a, i, i+1);
						swapped = true;
					}
				}
			}
			
		}

	}
			

	// DESCRIPTION - Sorts integer array ascending (true) or descending (false) directions, recursively.
	// PARAMETERS - int[] a, boolean ascending
	// RETURN TYPE - void
	public static String[] bubbleSortStringsRecursive(String[] a, boolean ascending)  {
				
		boolean swapped = true;
		
		// check if order is to be ascending or not
		if (ascending == true) {

			swapped = false;
			
			for (int i=0; i<a.length-1; i++)  {
			
				// if string is later alphabetically, swap
				if (a[i].compareTo(a[i + 1]) > 0) {
					
					swap(a, i, i+1);
					swapped = true;
					
				}
				
			}
			
			// if anything was swapped, repeat function
			if (swapped == true) {
				
				return bubbleSortStringsRecursive(a, ascending);
				
			}
			
			else 
				return a;

			
		}
		
		else {
			
			swapped = false;
			
			for (int i=0; i<a.length-1; i++)  {
			
				// if string is earlier alphabetically, swap
				if (a[i].compareTo(a[i + 1]) < 0) {
					
					swap(a, i, i+1);
					swapped = true;
					
				}
				
			}
			
			// if anything was swapped, repeat function
			if (swapped == true) {
				
				return bubbleSortStringsRecursive(a, ascending);
				
			}
			
			else 
				return a;

			
		}
		
	}
			
			
	// DESCRIPTION - Prints contents of integer array.
	// PARAMETERS - int[] a
	// RETURN TYPE - void
	public static void printIntArray(int[] a)  {
				
		for (int i=0; i<a.length; i++)  {
					
			System.out.print(a[i] + " ");
		}
			
	System.out.println("");
	}
			
			
	// DESCRIPTION - Prints contents of String array.
	// PARAMETERS - String[] a
	// RETURN TYPE - void
	public static void printStringArray(String[] a)  {
				
		for (int i=0; i<a.length; i++)  {
				
			System.out.print(a[i] + " ");
	
		}
			
		System.out.println("");
		
	}
			
			
	// DESCRIPTION - Swaps int array elements x with y.
	// PARAMETERS - int[] a, int x, int y
	// RETURN TYPE - void
	public static void swap(int[] a, int x, int y)  {
				
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
		
	}
		
			
	// DESCRIPTION - Swaps String array elements x with y.
	// PARAMETERS - String[] a, int x, int y
	// RETURN TYPE - void
	public static void swap(String[] a, int x, int y)  {
			
		String temp = a[x];
		a[x] = a[y];
		a[y] = temp;

	}	

}
