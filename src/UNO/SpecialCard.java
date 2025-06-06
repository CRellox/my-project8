package UNO;

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
	
}
