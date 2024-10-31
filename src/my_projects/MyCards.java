package my_projects;

import java.util.ArrayList;

public class MyCards {

	public static void main(String[] args) {
		
		ArrayList<Integer> orderedCards = new ArrayList<>();
		ArrayList<Integer> gameBoard = new ArrayList<>();
		
		for (int i=0; i<8; i++) {
			
			for (int j=0; j<2; j++) {
				
				orderedCards.add(i);
				
			}
			
		}
		
		System.out.println("OrderedCards: " + orderedCards);
		
		int random;
		for (int i=15; i>=0; i--) {
			
			random = (int)(Math.random() * (i+1));
			gameBoard.add(orderedCards.get(random));
			orderedCards.remove(orderedCards.get(random));
			
		}
		
		System.out.println("Gameboard: " + gameBoard);

	}

}
