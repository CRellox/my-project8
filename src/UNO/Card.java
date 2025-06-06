package UNO;

public class Card {
	
    protected Effect effect;
    
    
    
    public Card(Effect effect) {
        this.effect = effect;
    }
    
    public Effect getEffect() {
		return effect;
	}

	public void setEffect(Effect effect) {
		this.effect = effect;
	}
    
}
