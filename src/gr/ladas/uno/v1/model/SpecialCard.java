package gr.ladas.uno.v1.model;

import gr.ladas.uno.v1.core.enums.Color;
import gr.ladas.uno.v1.core.enums.Effect;

public class SpecialCard extends Card {
	
	private Color color;
	
	
	
	public SpecialCard(Color color, Effect effect) {
		super(effect);
		
		this.color = color;
		this.effect = effect;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color + " " + effect.name();
	}
	
}
