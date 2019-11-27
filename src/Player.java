public class Player extends Participant {
	public Player() {
		this.role = "Player";
	}

	@Override
	public void takeCard(Card card) {
		this.myCards.add(card);
		card.setHidden(false);

		if (card.needsValue()) {
			card.setValue(this.decideAceValue());
		}
	}

}
