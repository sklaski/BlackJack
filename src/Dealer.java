
public class Dealer extends Participant {
	public Dealer() {
		this.role = "Dealer";
	}

	@Override
	public void takeCard(Card card) {
		this.myCards.add(card);

		if (this.myCards.size() == 1) {
			card.setHidden(true);
		} else {
			card.setHidden(false);
		}

		if (card.needsValue()) {
			if (card.needsValue()) {
				if (this.getScore() + 11 >= 17 && this.getScore() + 11 < 21) {
					card.setValue(11);
				} else {
					card.setValue(1);
				}
			}

		}

	}

	public void unhideCards() {
		for (Card card : this.myCards) {
			if (card.isHidden()) {
				card.setHidden(false);
			}
		}
	}
}
