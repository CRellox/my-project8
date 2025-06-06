package UNO;

public class MyUnoApplication {
	
	private static Deck mainDeck;
	
	
	
	public static void main(String[] args) {
		init();
		
	}
	
	private static void init () {
		mainDeck = new Deck();
		
		mainDeck.getListOfAllCards();
	}
	
}
