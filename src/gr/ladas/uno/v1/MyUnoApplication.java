package gr.ladas.uno.v1;

import gr.ladas.uno.v1.model.NumberedCard;
import gr.ladas.uno.v1.model.SpecialCard;
import gr.ladas.uno.v1.model.WildCard;

import java.util.ArrayList;
import java.util.Scanner;

public class MyUnoApplication {
	
	private static Deck deck;

	private static MyHand myCards;

	private static BotHand botCards;
	
	private static ArrayList<Object> playedCards = new ArrayList<>();
	

	public static void main(String[] args) {
		System.out.println("UNO starting...\n");
		
		System.out.println("\nDo you want to play? Type y/n");
		
		Scanner readInput = new Scanner(System.in);
		
		String userOption = readInput.next();
		
		while (!userOption.equals("y") && !userOption.equals("n") && !userOption.equals("Y") && !userOption.equals("N")) {
			System.out.println("Wrong choice!\nPlease, try again!\n");
			
			userOption = readInput.next();
		}


		if (userOption.equals("y")) {
			System.out.println("Welcome to UNO!\n");
			
			initDeck();
			
			Object lastPlayedCard = deck.listOfCards.remove(0);
			
			playedCards.add(lastPlayedCard);
			
			System.out.println("Last played card: " + lastPlayedCard);
			
			System.out.println("\nYou play first!");
			
			drawMyCards();
			
			drawBotCards();
			
			System.out.println("\nYour hand:");
			
			System.out.print(myCards.getMyNumberedCards());
			System.out.print(myCards.getMySpecialCards());
			System.out.print(myCards.getMyWildCards());
			
			System.out.println("\n\nPlease, select a card from your hand!");
			
			String userCardOption = readInput.next();
			
			switch (userCardOption) {
				case "1":
					System.out.println("");
					
					break;
				case "2":
					System.out.println("");
					
					break;
				case "3":
					System.out.println("");
					
					break;
				case "4":
					System.out.println("");
					
					break;
				case "5":
					System.out.println("");
					
					break;
				case "6":
					System.out.println("");
					
					break;
				case "7":
					System.out.println("");
					
					break;
				default:
					System.out.println("\n\nMaybe next time!\nUNO terminated!");
					break;
			}
			
			System.out.println("\nUNO: I am still dummy... wait for more updates!");
		} else {
			System.out.println("\nMaybe next time!\nUNO terminated!");
		}
		
		readInput.close();
	}
	
	private static void initDeck() {
		deck = new Deck();
		
		deck.createListOfAllCards();
		
		deck.shuffleDeck();
		
		//System.out.println("Printing deck...\n");
		
		//System.out.println(deck.getListOfCards());
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
