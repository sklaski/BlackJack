
public class Dealer extends Participant {

	@Override
	public void takeCard(Card card) {
		if (this.myCards.size() == 0) {
			card.setHidden(true);
		} else {
			card.setHidden(false);
		}

		this.myCards.add(card);
	}
}
