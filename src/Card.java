
public class Card {
	private char color;
	private char type;
	private int value;
	private boolean hidden;

	public Card(char color, char type, int value) {
		super();
		this.value = value;
		this.color = color;
		this.type = type;
		this.hidden = false;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

	public char getColor() {
		return color;
	}

	public char getType() {
		return type;
	}

	public String display() {
		if (hidden) {
			return "hidden card";
		} else {
			return "" + this.getColor() + this.getType() + this.getValue();
		}
	}

	public boolean needsValue() {
		if (type == 'A') {
			return true;
		} else {
			return false;
		}
	};
}
