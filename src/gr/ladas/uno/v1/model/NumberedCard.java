package gr.ladas.uno.v1.model;

import gr.ladas.uno.v1.core.enums.Color;
import gr.ladas.uno.v1.core.enums.Effect;

public class NumberedCard extends Card {
	
    private Color color;
    private int number;
    
    
            
	public NumberedCard(Color color, int number, Effect effect) {
		super(effect);
		
        this.color = color;
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

	@Override
	public String toString() {
		return color + " " + number;
	}
    
}
