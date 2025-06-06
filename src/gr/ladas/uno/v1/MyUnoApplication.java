package gr.ladas.uno.v1;

import java.io.IOException;

public class MyUnoApplication {
	
	private static Deck availableCardsDeck;
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("UNO starting...\n");
		
		initDeck();
		
		System.out.println("\nDo you want to play? Type y/n");
		
		try {
			int userOption = System.in.read();
			
			if (userOption == 'y') {
				System.out.println("\nSelect a card from your hand:");
				
				//TODO Print the cards from your hand...
				
				
				
				int userCardOption = System.in.read();
				
				switch (userCardOption) {
					case '1':
						System.out.println("");
						
						break;
					case '2':
						System.out.println("");
						
						break;
					case '3':
						System.out.println("");
						
						break;
					case '4':
						System.out.println("");
						
						break;
					case '5':
						System.out.println("");
						
						break;
					case '6':
						System.out.println("");
						
						break;
					case '7':
						System.out.println("");
						
						break;
					default:
						System.out.println("");
						
						break;
				}
				
				System.out.println("\nUNO: I am still dummy... wait for more updates!");
			} else {
				System.out.println("\nUNO terminated!");
			}
		} catch (IOException e) {
			System.out.println("Error occured: " + e.getMessage());
		}
	}
	
	private static void initDeck() {
		availableCardsDeck = new Deck();
		
		availableCardsDeck.createListOfAllCards();
		
		System.out.println("Printing deck...\n");
		
		System.out.println(availableCardsDeck.getListOfCards());
	}
	
}
