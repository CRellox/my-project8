package gr.ladas.uno.v1;

import gr.ladas.uno.v1.model.NumberedCard;
import gr.ladas.uno.v1.model.SpecialCard;
import gr.ladas.uno.v1.model.WildCard;

import java.io.IOException;

public class MyUnoApplication {
	
	private static Deck deck;

	private static MyHand myCards;

	private static BotHand botCards;
	

	public static void main(String[] args) {
		System.out.println("UNO starting...\n");

		System.out.println("\nDo you want to play? Type y/n");
		
		try {
			int userOption = System.in.read();
			
			if (userOption == 'y') {
				System.out.println("Welcome to UNO!\n");

				initDeck();

				System.out.print("Starter card: ");
				System.out.println(deck.listOfCards.stream().findAny());
				System.out.println();

				System.out.println("You play first!");

				drawMyCards();

				drawBotCards();

				System.out.println("Your hand:");
				System.out.print(myCards.getMyNumberedCards());
				System.out.print(myCards.getMySpecialCards());
				System.out.println(myCards.getMyWildCards());

				System.out.println("\nPlease, select a card from your hand!");

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

			} else if (userOption == 'n') {
				System.out.println("\nUNO terminated!");
			} else {
				System.out.println("Wrong choice!\nPlease, try again!\n");
			}
		} catch (IOException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
	}
	
	private static void initDeck() {
		deck = new Deck();
		
		deck.createListOfAllCards();
		
//		System.out.println("Printing deck...\n");
		
//		System.out.println(deck.getListOfCards());
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
