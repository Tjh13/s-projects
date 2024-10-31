package my_projects;

import java.util.Scanner;

public class OneDimensionalArrays {

	public static void main(String[] args) {

		// repeats code until user wants to be done
		while (true) {
			
			// initialize variables
			Scanner sc = new Scanner(System.in);
			int[] array = new int[12];
			int sum = 0;
			int evenSum = 0;
			int oddSum = 0;
			String userRestart;
			
			// use allInts function, put into success variable
			int success = allInts(array, sc);
			
			// if success is true, use sumInts, even, and odd functions
			if (success == 1) {
				
				sumInts(sum, array);
				even(evenSum, array);
				odd(oddSum, array);
				
			}
			
			// give use chance to exit
			System.out.println("Enter R or r to restart or anything else to exit!");
			userRestart = sc.next();
			if (userRestart.equals("r") && userRestart.equals("r")) {
			}
			else {
				
				break;
				
			}
			
		}
		
		
		
	}
	
	// DESCRIPTION: allows user to input 12 integers into array and prints result
	// PARAMETERS: int[] array, Scanner sc
	// RETURN TYPE: int
	public static int allInts(int[] array, Scanner sc) {
		
		for (int i=1; i<=12; i++) {
			
			System.out.println("Enter integer number " + i + "!");
			try {
				
				int n = sc.nextInt();
				array[i-1] = n;

			}
			catch (Exception f) {
				
				System.out.println("Please enter integers only!");
				return 0;
				
			}
	
		}
		
		System.out.println("Here are all of the integers in your array!");
		for (int i=0; i<12; i++) {
			
			System.out.println((i+1) + ": " + array[i]);
			
		}
		
		return 1;
		
	}
	
	// DESCRIPTION: adds up all integers in array and outputs result sum
	// PARAMETERS: int sum, int[] array
	// RETURN TYPE: void
	public static void sumInts(int sum, int array[]) {
			
		for (int i=0; i<12; i++) {
			
			sum += array[i];
			
		}
		System.out.println("The sum of all of your integers is " + sum + "!");
				
	}
	
	// DESCRIPTION: finds all even integers in array, adds them all up, and outputs result sum
	// PARAMETERS: int evenSum, int[] array
	// RETURN TYPE: void
	public static void even(int evenSum, int array[]) {
				
		System.out.println("Here are all of the even numbers in your array!");
		for (int i=0; i<12; i++) {
			
			if ((array[i] % 2) == 0) {
				
				System.out.print(array[i] + " ");
				evenSum += array[i];
				
			}
			
		}
		System.out.println("\nThe sum of all of the even numbers in your array is " + evenSum + "!");
					
	}
	
	// DESCRIPTION: finds odd even integers in array, adds them all up, and outputs result sum
	// PARAMETERS: int oddSum, int[] array
	// RETURN TYPE: void
	public static void odd(int oddSum, int array[]) {
					
		System.out.println("Here are all of the odd numbers in your array!");
		for (int i=0; i<12; i++) {
			
			if ((array[i] % 2) != 0) {
				
				System.out.print(array[i] + " ");
				oddSum += array[i];
				
			}
			
		}
		System.out.println("\nThe sum of all of the odd numbers in your array is " + oddSum + "!");
						
	}
			
}


