package UNO;

import java.util.ArrayList;

public class Deck {

	ArrayList<Card> listOfCards = new ArrayList<>();
	
	// Red Standard Cards
	Card cardR0 = new NumberedCard(Color.RED, 0, Effect.NUMBER);
	Card cardR1 = new NumberedCard(Color.RED, 1, Effect.NUMBER);
	Card cardR2 = new NumberedCard(Color.RED, 2, Effect.NUMBER);
	Card cardR3 = new NumberedCard(Color.RED, 3, Effect.NUMBER);
	Card cardR4 = new NumberedCard(Color.RED, 4, Effect.NUMBER);
	Card cardR5 = new NumberedCard(Color.RED, 5, Effect.NUMBER);
	Card cardR6 = new NumberedCard(Color.RED, 6, Effect.NUMBER);
	Card cardR7 = new NumberedCard(Color.RED, 7, Effect.NUMBER);
	Card cardR8 = new NumberedCard(Color.RED, 8, Effect.NUMBER);
	Card cardR9 = new NumberedCard(Color.RED, 9, Effect.NUMBER);

	// Red Special Cards
	SpecialCard cardRR = new SpecialCard(Color.RED, Effect.REVERSE);
	SpecialCard cardRS = new SpecialCard(Color.RED, Effect.SKIP);
	SpecialCard cardRP2 = new SpecialCard(Color.RED, Effect.PLUS2);

	// Blue Standard Cards
	Card cardB0 = new NumberedCard(Color.BLUE, 0, Effect.NUMBER);
	Card cardB1 = new NumberedCard(Color.BLUE, 1, Effect.NUMBER);
	Card cardB2 = new NumberedCard(Color.BLUE, 2, Effect.NUMBER);
	Card cardB3 = new NumberedCard(Color.BLUE, 3, Effect.NUMBER);
	Card cardB4 = new NumberedCard(Color.BLUE, 4, Effect.NUMBER);
	Card cardB5 = new NumberedCard(Color.BLUE, 5, Effect.NUMBER);
	Card cardB6 = new NumberedCard(Color.BLUE, 6, Effect.NUMBER);
	Card cardB7 = new NumberedCard(Color.BLUE, 7, Effect.NUMBER);
	Card cardB8 = new NumberedCard(Color.BLUE, 8, Effect.NUMBER);
	Card cardB9 = new NumberedCard(Color.BLUE, 9, Effect.NUMBER);

	// Blue Special Cards
	SpecialCard cardBR = new SpecialCard(Color.BLUE, Effect.REVERSE);
	SpecialCard cardBS = new SpecialCard(Color.BLUE, Effect.SKIP);
	SpecialCard cardBP2 = new SpecialCard(Color.BLUE, Effect.PLUS2);

	// Green Standard Cards
	Card cardG0 = new NumberedCard(Color.GREEN, 0, Effect.NUMBER);
	Card cardG1 = new NumberedCard(Color.GREEN, 1, Effect.NUMBER);
	Card cardG2 = new NumberedCard(Color.GREEN, 2, Effect.NUMBER);
	Card cardG3 = new NumberedCard(Color.GREEN, 3, Effect.NUMBER);
	Card cardG4 = new NumberedCard(Color.GREEN, 4, Effect.NUMBER);
	Card cardG5 = new NumberedCard(Color.GREEN, 5, Effect.NUMBER);
	Card cardG6 = new NumberedCard(Color.GREEN, 6, Effect.NUMBER);
	Card cardG7 = new NumberedCard(Color.GREEN, 7, Effect.NUMBER);
	Card cardG8 = new NumberedCard(Color.GREEN, 8, Effect.NUMBER);
	Card cardG9 = new NumberedCard(Color.GREEN, 9, Effect.NUMBER);

	// Green Special Cards
	SpecialCard cardGR = new SpecialCard(Color.GREEN, Effect.REVERSE);
	SpecialCard cardGS = new SpecialCard(Color.GREEN, Effect.SKIP);
	SpecialCard cardGP2 = new SpecialCard(Color.GREEN, Effect.PLUS2);

	// Yellow Standard Cards
	Card cardY0 = new NumberedCard(Color.YELLOW, 0, Effect.NUMBER);
	Card cardY1 = new NumberedCard(Color.YELLOW, 1, Effect.NUMBER);
	Card cardY2 = new NumberedCard(Color.YELLOW, 2, Effect.NUMBER);
	Card cardY3 = new NumberedCard(Color.YELLOW, 3, Effect.NUMBER);
	Card cardY4 = new NumberedCard(Color.YELLOW, 4, Effect.NUMBER);
	Card cardY5 = new NumberedCard(Color.YELLOW, 5, Effect.NUMBER);
	Card cardY6 = new NumberedCard(Color.YELLOW, 6, Effect.NUMBER);
	Card cardY7 = new NumberedCard(Color.YELLOW, 7, Effect.NUMBER);
	Card cardY8 = new NumberedCard(Color.YELLOW, 8, Effect.NUMBER);
	Card cardY9 = new NumberedCard(Color.YELLOW, 9, Effect.NUMBER);

	// Yellow Special Cards
	SpecialCard cardYR = new SpecialCard(Color.YELLOW, Effect.REVERSE);
	SpecialCard cardYS = new SpecialCard(Color.YELLOW, Effect.SKIP);
	SpecialCard cardYP2 = new SpecialCard(Color.YELLOW, Effect.PLUS2);

	// Wild Cards
	WildCard Wild = new WildCard(Effect.CHANGE_COLOR);
	WildCard DrawFourCards = new WildCard(Effect.CHANGE_COLOR_PLUS4);
	
	
	
	
	
	public Deck() {
		
	}
	
	public ArrayList<Card> getListOfAllCards() {
		// Red
		
		listOfCards.add(cardR0);
		listOfCards.add(cardR1);
		listOfCards.add(cardR2);
		listOfCards.add(cardR3);
		listOfCards.add(cardR4);
		listOfCards.add(cardR5);
		listOfCards.add(cardR6);
		listOfCards.add(cardR7);
		listOfCards.add(cardR8);
		listOfCards.add(cardR9);
		
		listOfCards.add(cardRR);
		listOfCards.add(cardRS);
		listOfCards.add(cardRP2);
		
		
		
		// Green
		
		listOfCards.add(cardG0);
		listOfCards.add(cardG1);
		listOfCards.add(cardG2);
		listOfCards.add(cardG3);
		listOfCards.add(cardG4);
		listOfCards.add(cardG5);
		listOfCards.add(cardG6);
		listOfCards.add(cardG7);
		listOfCards.add(cardG8);
		listOfCards.add(cardG9);
		
		listOfCards.add(cardGR);
		listOfCards.add(cardGS);
		listOfCards.add(cardGP2);

		
		
		// Blue
		
		listOfCards.add(cardB0);
		listOfCards.add(cardB1);
		listOfCards.add(cardB2);
		listOfCards.add(cardB3);
		listOfCards.add(cardB4);
		listOfCards.add(cardB5);
		listOfCards.add(cardB6);
		listOfCards.add(cardB7);
		listOfCards.add(cardB8);
		listOfCards.add(cardB9);
		
		listOfCards.add(cardBR);
		listOfCards.add(cardBS);
		listOfCards.add(cardBP2);
		
		
		// Yellow
		
		listOfCards.add(cardY0);
		listOfCards.add(cardY1);
		listOfCards.add(cardY2);
		listOfCards.add(cardY3);
		listOfCards.add(cardY4);
		listOfCards.add(cardY5);
		listOfCards.add(cardY6);
		listOfCards.add(cardY7);
		listOfCards.add(cardY8);
		listOfCards.add(cardY9);
		
		listOfCards.add(cardYR);
		listOfCards.add(cardYS);
		listOfCards.add(cardYP2);
		
		
		return listOfCards;
	}
	
}