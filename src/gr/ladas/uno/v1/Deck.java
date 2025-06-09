package gr.ladas.uno.v1;

import java.util.ArrayList;
import java.util.Collections;

import gr.ladas.uno.v1.enums.Color;
import gr.ladas.uno.v1.enums.Effect;
import gr.ladas.uno.v1.model.NumberedCard;
import gr.ladas.uno.v1.model.SpecialCard;
import gr.ladas.uno.v1.model.WildCard;

public class Deck {

	ArrayList<Object> listOfCards = new ArrayList<>();
	
	
	
	public Deck() {

	}
	
	public ArrayList<Object> getListOfCards() {
		return listOfCards;
	}

	public void createListOfAllCards() {
		System.out.println("Preparing deck...\n");
		
		// Red
		
		listOfCards.add(new NumberedCard(Color.RED, 0, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 0, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 1, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 1, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 2, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 2, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 3, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 3, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 4, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 4, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 5, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 5, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 6, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 6, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 7, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 7, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 8, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 8, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 9, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.RED, 9, Effect.NUMBER));

		listOfCards.add(new SpecialCard(Color.RED, Effect.REVERSE));
		listOfCards.add(new SpecialCard(Color.RED, Effect.REVERSE));
		listOfCards.add(new SpecialCard(Color.RED, Effect.SKIP));
		listOfCards.add(new SpecialCard(Color.RED, Effect.SKIP));
		listOfCards.add(new SpecialCard(Color.RED, Effect.PLUS2));
		listOfCards.add(new SpecialCard(Color.RED, Effect.PLUS2));
		
		

		// Green

		listOfCards.add(new NumberedCard(Color.GREEN, 0, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 0, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 1, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 1, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 2, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 2, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 3, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 3, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 4, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 4, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 5, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 5, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 6, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 6, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 7, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 7, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 8, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 8, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 9, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.GREEN, 9, Effect.NUMBER));

		listOfCards.add(new SpecialCard(Color.GREEN, Effect.REVERSE));
		listOfCards.add(new SpecialCard(Color.GREEN, Effect.REVERSE));
		listOfCards.add(new SpecialCard(Color.GREEN, Effect.SKIP));
		listOfCards.add(new SpecialCard(Color.GREEN, Effect.SKIP));
		listOfCards.add(new SpecialCard(Color.GREEN, Effect.PLUS2));
		listOfCards.add(new SpecialCard(Color.GREEN, Effect.PLUS2));

		
		
		// Blue

		listOfCards.add(new NumberedCard(Color.BLUE, 0, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 0, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 1, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 1, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 2, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 2, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 3, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 3, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 4, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 4, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 5, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 5, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 6, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 6, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 7, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 7, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 8, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 8, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 9, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.BLUE, 9, Effect.NUMBER));

		listOfCards.add(new SpecialCard(Color.BLUE, Effect.REVERSE));
		listOfCards.add(new SpecialCard(Color.BLUE, Effect.REVERSE));
		listOfCards.add(new SpecialCard(Color.BLUE, Effect.SKIP));
		listOfCards.add(new SpecialCard(Color.BLUE, Effect.SKIP));
		listOfCards.add(new SpecialCard(Color.BLUE, Effect.PLUS2));
		listOfCards.add(new SpecialCard(Color.BLUE, Effect.PLUS2));

		
		
		// Yellow

		listOfCards.add(new NumberedCard(Color.YELLOW, 0, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 0, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 1, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 1, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 2, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 2, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 3, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 3, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 4, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 4, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 5, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 5, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 6, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 6, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 7, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 7, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 8, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 8, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 9, Effect.NUMBER));
		listOfCards.add(new NumberedCard(Color.YELLOW, 9, Effect.NUMBER));

		listOfCards.add(new SpecialCard(Color.YELLOW, Effect.REVERSE));
		listOfCards.add(new SpecialCard(Color.YELLOW, Effect.REVERSE));
		listOfCards.add(new SpecialCard(Color.YELLOW, Effect.SKIP));
		listOfCards.add(new SpecialCard(Color.YELLOW, Effect.SKIP));
		listOfCards.add(new SpecialCard(Color.YELLOW, Effect.PLUS2));
		listOfCards.add(new SpecialCard(Color.YELLOW, Effect.PLUS2));

		listOfCards.add(new WildCard(Effect.CHANGE_COLOR_PLUS4));
		listOfCards.add(new WildCard(Effect.CHANGE_COLOR_PLUS4));
		listOfCards.add(new WildCard(Effect.CHANGE_COLOR_PLUS4));
		listOfCards.add(new WildCard(Effect.CHANGE_COLOR_PLUS4));

		listOfCards.add(new WildCard(Effect.CHANGE_COLOR));
		listOfCards.add(new WildCard(Effect.CHANGE_COLOR));
		listOfCards.add(new WildCard(Effect.CHANGE_COLOR));
		listOfCards.add(new WildCard(Effect.CHANGE_COLOR));
		
		System.out.println("Deck preparation finished!\n");
	}
	
	public void shuffleDeck() { 
		System.out.println("Shuffling deck...\n");
		
		Collections.shuffle(listOfCards);
		
		System.out.println("Deck shuffled!\n");
	}

}