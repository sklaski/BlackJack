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
//			return "hidden card";
			return "🃏";
		} else {

			// Unicode picture

			switch (this.getType()) {
			case 'a':
				switch (this.getColor()) {
				case '\u2666':
					return "🃁";
				case '\u2665':
					return "🂱";
				case '\u2660':
					return "🂡";
				case '\u2663':
					return "🃑";
				}
			case '2':
				switch (this.getColor()) {
				case '\u2666':
					return "🃂";
				case '\u2665':
					return "🂲";
				case '\u2660':
					return "🂢";
				case '\u2663':
					return "🃒";
				}
			case '3':
				switch (this.getColor()) {
				case '\u2666':
					return "🃃";
				case '\u2665':
					return "🂳";
				case '\u2660':
					return "🂣";
				case '\u2663':
					return "🃓";
				}
			case '4':
				switch (this.getColor()) {
				case '\u2666':
					return "🃄";
				case '\u2665':
					return "🂴";
				case '\u2660':
					return "🂤";
				case '\u2663':
					return "🃔";
				}
			case '5':
				switch (this.getColor()) {
				case '\u2666':
					return "🃅";
				case '\u2665':
					return "🂵";
				case '\u2660':
					return "🂥";
				case '\u2663':
					return "🃕";
				}
			case '6':
				switch (this.getColor()) {
				case '\u2666':
					return "🃆";
				case '\u2665':
					return "🂶";
				case '\u2660':
					return "🂦";
				case '\u2663':
					return "🃖";
				}
			case '7':
				switch (this.getColor()) {
				case '\u2666':
					return "🃇";
				case '\u2665':
					return "🂷";
				case '\u2660':
					return "🂧";
				case '\u2663':
					return "🃗";
				}
			case '8':
				switch (this.getColor()) {
				case '\u2666':
					return "🃈";
				case '\u2665':
					return "🂸";
				case '\u2660':
					return "🂨";
				case '\u2663':
					return "🃘";
				}
			case '9':
				switch (this.getColor()) {
				case '\u2666':
					return "🃉";
				case '\u2665':
					return "🂹";
				case '\u2660':
					return "🂩";
				case '\u2663':
					return "🃙";
				}
			case '0':
				switch (this.getColor()) {
				case '\u2666':
					return "🃊";
				case '\u2665':
					return "🂺";
				case '\u2660':
					return "🂪";
				case '\u2663':
					return "🃚";
				}
			case 'j':
				switch (this.getColor()) {
				case '\u2666':
					return "🃋";
				case '\u2665':
					return "🂻";
				case '\u2660':
					return "🂫";
				case '\u2663':
					return "🃛";
				}
			case 'q':
				switch (this.getColor()) {
				case '\u2666':
					return "🃍";
				case '\u2665':
					return "🂽";
				case '\u2660':
					return "🂭";
				case '\u2663':
					return "🃝";
				}
			case 'k':
				switch (this.getColor()) {
				case '\u2666':
					return "🃎";
				case '\u2665':
					return "🂾";
				case '\u2660':
					return "🂮";
				case '\u2663':
					return "🃞";
				}
			}

		}
		return "" + this.getColor() + this.getType();
	}

	public boolean needsValue() {
		if (Character.toUpperCase(type) == 'A') {
			return true;
		} else {
			return false;
		}
	};
}
