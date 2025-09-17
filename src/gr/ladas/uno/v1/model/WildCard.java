package gr.ladas.uno.v1.model;

import gr.ladas.uno.v1.core.enums.Effect;

public class WildCard extends Card {

	public WildCard(Effect effect) {
		super(effect);
	}
	
	@Override
	public String toString() {
		return effect.name();
	}
	
}
