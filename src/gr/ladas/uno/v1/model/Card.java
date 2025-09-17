package gr.ladas.uno.v1.model;

import gr.ladas.uno.v1.core.enums.Effect;

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
