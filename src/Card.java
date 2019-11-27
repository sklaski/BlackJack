
public class Card {
	private char color;
	private char type;
	private int value;

	public Card(char color, char type, int value) {
		super();
		this.value = value;
		this.color = color;
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public char getColor() {
		return color;
	}

	public char getType() {
		return type;
	}

}
