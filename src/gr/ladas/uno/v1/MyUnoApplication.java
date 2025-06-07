package gr.ladas.uno.v1;

import gr.ladas.uno.v1.model.NumberedCard;
import gr.ladas.uno.v1.model.SpecialCard;
import gr.ladas.uno.v1.model.WildCard;

import java.io.IOException;

public class MyUnoApplication {
	
	private static Deck deck;

	private static MyHand myCards;

	private static BotHand botCards;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("UNO starting...\n");

		System.out.println("\nDo you want to play? Type y/n");
		
		try {
			int userOption = System.in.read();
			
			if (userOption == 'y') {
				initDeck();

				drawMyCards();

				drawBotCards();

				System.out.println(myCards.getMyWildCards());
				System.out.println(myCards.getMyNumberedCards());
				System.out.println(myCards.getMySpecialCards());

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
			System.out.println("Error occurred: " + e.getMessage());
		}
	}
	
	private static void initDeck() {
		deck = new Deck();
		
		deck.createListOfAllCards();
		
		System.out.println("Printing deck...\n");
		
		System.out.println(deck.getListOfCards());
	}

	private static void drawMyCards() {
		myCards = new MyHand();

		for (int i = 0; i < 7; i++) {
			Object aDrawedCard = deck.getListOfCards().remove(0);

			if (aDrawedCard instanceof NumberedCard) {
				myCards.addNumberedCard((NumberedCard) aDrawedCard);
			} else if (aDrawedCard instanceof SpecialCard) {
				myCards.addSpecialCard((SpecialCard) aDrawedCard);
			} else if (aDrawedCard instanceof WildCard) {
				myCards.addWildCard((WildCard) aDrawedCard);
			}
		}
	}

	private static void drawBotCards() {
		botCards = new BotHand();

		for (int i = 0; i < 7; i++) {
			Object aDrawedCard = deck.getListOfCards().remove(0);

			if (aDrawedCard instanceof NumberedCard) {
				botCards.addNumberedCard((NumberedCard) aDrawedCard);
			} else if (aDrawedCard instanceof SpecialCard) {
				botCards.addSpecialCard((SpecialCard) aDrawedCard);
			} else if (aDrawedCard instanceof WildCard) {
				botCards.addWildCard((WildCard) aDrawedCard);
			}
		}
	}
}
