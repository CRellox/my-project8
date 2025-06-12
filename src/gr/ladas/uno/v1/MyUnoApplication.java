package gr.ladas.uno.v1;

import gr.ladas.uno.v1.model.NumberedCard;
import gr.ladas.uno.v1.model.SpecialCard;
import gr.ladas.uno.v1.model.WildCard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MyUnoApplication {
	private static Deck deck;
	private static MyHand myCards;
	private static BotHand botCards;
	private static ArrayList<Object> playedCards = new ArrayList<>();
	private static HashMap<String, Object> optionsHolder = new HashMap<String, Object>();
	
	private final static Scanner readInput = new Scanner(System.in);
	


	public static void main(String[] args) {
		System.out.println("UNO starting...\n");
		System.out.println("\nDo you want to play? Type y/n");

		String userOption = readInput.next();

		while (!userOption.equals("y") && !userOption.equals("n") && !userOption.equals("Y") && !userOption.equals("N")) {
			clearScren();
			
			System.out.println("Wrong choice!\nPlease, try again!\n");
			
			userOption = readInput.next();
		}

		if (userOption.equals("y")) {
			clearScren();
			
			System.out.println("Welcome to UNO!\n");

			initDeck();

			lastPlayedCard();

			System.out.println("\nYou play first!");

			drawMyCards();

			drawBotCards();

			String userCardOption;
			
			do {
				printMyHand();
				
				userCardOption = readInput.next();
				
				while (!userCardOption.equals("*") && !userCardOption.equals("1") && !userCardOption.equals("2") && !userCardOption.equals("3") && !userCardOption.equals("4") && !userCardOption.equals("5") && !userCardOption.equals("6") && !userCardOption.equals("7")) {
					clearScren();
					
					System.out.println("Wrong choice!\nPlease, try again!\n");
					
					printMyHand();
					
					userCardOption = readInput.next();
				}
				
				if (!userCardOption.equals("*")) {
					while (Integer.parseInt(userCardOption) > optionsHolder.size()) {
						clearScren();
						
						System.out.println("Wrong choice!\nPlease, try again!\n");
						
						userCardOption = readInput.next();
					}
					
					Object playedCard = optionsHolder.get(userCardOption);
					
					playedCards.add(playedCard);
					
					myCards.removePlayedCard(playedCard);
					
					//TODO bot should play as well...
					
					clearScren();
					
					System.out.println("Last played card: " + playedCards.get(playedCards.size() - 1));
					
					if (optionsHolder.size() == 1) {
						break;
					} else {
						optionsHolder = new HashMap<String, Object>();
					}
				}
			} while (userCardOption.equals("1") || userCardOption.equals("2") || userCardOption.equals("3") || userCardOption.equals("4") || userCardOption.equals("5") || userCardOption.equals("6") || userCardOption.equals("7"));
			
			System.out.println("\nUno Ended\nBye for now!");
		} else {
			System.out.println("\nMaybe next time!\nUNO terminated!");
		}
		
		readInput.close();
	}

	/**
	 * Creates and shuffles the cards of the deck.
	 */
	private static void initDeck() {
		deck = new Deck();

		deck.createListOfAllCards();

		deck.shuffleDeck();
	}

	/**
	 * At the start of the game, player receives 7 random cards
	 * from the shuffled deck.
	 * Also, prints the received cards.
	 */
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

	/**
	 * At the start of the game, bot receives 7 random cards
	 * from the shuffled deck.
	 */
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

	/**
	 * Displays the lastly card played.
	 */
	private static void lastPlayedCard() {
		Object lastPlayedCard = deck.listOfCards.remove(0);
		
		playedCards.add(lastPlayedCard);
		
		System.out.println("Last played card: " + lastPlayedCard);
	}
	
	private static void printMyHand() {
		System.out.println("\nYour hand:\n");
		
		int optionsIndex = 1;
		
		for (int i = 0; i < myCards.getMyNumberedCards().size(); i++) {
			Object currentCard = myCards.getMyNumberedCards().get(i);
			
			System.out.println(optionsIndex + ") " + currentCard);
			
			optionsHolder.put(String.valueOf(optionsIndex), currentCard);
			
			optionsIndex++;
		}
		
		for (int i = 0; i < myCards.getMySpecialCards().size(); i++) {
			Object currentCard = myCards.getMySpecialCards().get(i);
			
			System.out.println(optionsIndex + ") " + currentCard);
			
			optionsHolder.put(String.valueOf(optionsIndex), currentCard);
			
			optionsIndex++;
		}
		
		for (int i = 0; i < myCards.getMyWildCards().size(); i++) {
			Object currentCard = myCards.getMyWildCards().get(i);
			
			System.out.println(optionsIndex + ") " + currentCard);
			
			optionsHolder.put(String.valueOf(optionsIndex), currentCard);
			
			optionsIndex++;
		}
		
		System.out.println("\n\nPlease, select a card from your hand:");
	}
	
	private static void clearScren() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
	
}
