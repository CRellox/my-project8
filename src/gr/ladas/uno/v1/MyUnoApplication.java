package gr.ladas.uno.v1;

import gr.ladas.uno.v1.model.NumberedCard;
import gr.ladas.uno.v1.model.SpecialCard;
import gr.ladas.uno.v1.model.WildCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MyUnoApplication {
	private static Deck deck;
	private static MyHand myCards;
	private static BotHand botCards;
	private static final ArrayList<Object> playedCards = new ArrayList<>();
    private static final ArrayList<Object> playedBotsCards = new ArrayList<>();
	private static HashMap<String, Object> optionsHolder = new HashMap<>();
	
	private final static Scanner readInput = new Scanner(System.in);
	


	public static void main(String[] args) {
		System.out.println("UNO starting...\n");
		System.out.println("\nDo you want to play? Type y/n");

		String userOption = readInput.next();

		while (!userOption.equals("y") && !userOption.equals("n") && !userOption.equals("Y")
                && !userOption.equals("N")) {
			clearScreen();
			
			System.out.println("Wrong choice!\nPlease, try again!\n");
			
			userOption = readInput.next();
		}

		if (userOption.equals("y")) {

			clearScreen();
			
			System.out.println("Welcome to UNO!\n");

			initDeck();

			lastPlayedCard();

			System.out.println("`\nYou play first!");

			drawMyCards();

			drawBotCards();

			String userCardOption;
			
			do {
				printMyHand();
				
				userCardOption = readInput.next();
				
				while (!userCardOption.equals("*") && !userCardOption.matches("[1-7]")) {
					clearScreen();
					
					System.out.println("Wrong choice!\nPlease, try again!\n");
					
					printMyHand();
					
					userCardOption = readInput.next();
				}
				
				if (!userCardOption.equals("*")) {
					while (Integer.parseInt(userCardOption) > optionsHolder.size()) {
						clearScreen();
						
						System.out.println("Wrong choice!\nPlease, try again!\n");
						
						userCardOption = readInput.next();
					}
					
					Object playedCard = optionsHolder.get(userCardOption);
					
					playedCards.add(playedCard);
					
					myCards.removePlayedCard(playedCard);

					//TODO bot should play as well...
					
					clearScreen();
					
					System.out.println("Last played card: " + playedCards.getLast());
					
					if (optionsHolder.size() == 1) {
						break;
					} else {
						optionsHolder = new HashMap<>();
					}
				}
			} while (userCardOption.matches("[1-7]"));
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
			Object aDrawnCard = deck.getListOfCards().removeFirst();

			if (aDrawnCard instanceof NumberedCard) {
				myCards.addNumberedCard((NumberedCard) aDrawnCard);
			} else if (aDrawnCard instanceof SpecialCard) {
				myCards.addSpecialCard((SpecialCard) aDrawnCard);
			} else if (aDrawnCard instanceof WildCard) {
				myCards.addWildCard((WildCard) aDrawnCard);
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
			Object aDrawnCard = deck.getListOfCards().removeFirst();

			if (aDrawnCard instanceof NumberedCard) {
				botCards.addNumberedCard((NumberedCard) aDrawnCard);
			} else if (aDrawnCard instanceof SpecialCard) {
				botCards.addSpecialCard((SpecialCard) aDrawnCard);
			} else if (aDrawnCard instanceof WildCard) {
				botCards.addWildCard((WildCard) aDrawnCard);
			}
		}
	}

	/**
	 * Displays the lastly card played.
	 */
	private static void lastPlayedCard() {
		Object lastPlayedCard = deck.listOfCards.removeFirst();
		
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

	private static void printBotsHand() {
		int optionsIndex = 1;

		for (int i = 0; i < botCards.getMyNumberedCards().size(); i++) {
			Object currentCard = botCards.getMyNumberedCards().get(i);

			System.out.println(optionsIndex + ") " + currentCard);
			optionsHolder.put(String.valueOf(optionsIndex), currentCard);

			optionsIndex++;
		}

		for (int i = 0; i < botCards.getMySpecialCards().size(); i++) {
			Object currentCard = botCards.getMySpecialCards().get(i);

			System.out.println(optionsIndex + ") " + currentCard);

			optionsHolder.put(String.valueOf(optionsIndex), currentCard);

			optionsIndex++;
		}

		for (int i = 0; i < botCards.getMyWildCards().size(); i++) {
			Object currentCard = botCards.getMyWildCards().get(i);

			System.out.println(optionsIndex + ") " + currentCard);

			optionsHolder.put(String.valueOf(optionsIndex), currentCard);

			optionsIndex++;
		}
	}

	private static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
