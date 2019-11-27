
public class Dealer extends Participant {
	public Dealer() {
		this.role = "Dealer";
	}
	
	@Override
	public void takeCard(Card card) {
		this.myCards.add(card);

		if (this.myCards.size() == 0) {
			card.setHidden(true);
		} else {
			card.setHidden(false);
			if (card.needsValue()) {
				card.setValue(this.decideAceValue());
			}
		}

	}

	public void unhideCards() {
		for (Card card : this.myCards) {
			if (card.isHidden()) {
				card.setHidden(false);
				if (card.needsValue()) {
					card.setValue(this.decideAceValue());
				}
			}
		}
	}
}
