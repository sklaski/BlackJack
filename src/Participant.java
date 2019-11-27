import java.util.ArrayList;

public abstract class Participant {
	protected ArrayList<Card> myCards;

	public Participant() {
		 this.myCards = new ArrayList<>();
	};

	public abstract void takeCard(Card card);
	
	public void showCards() {
		for (Card card : myCards) {
			 System.out.println(card.display());
		}
	}
	
	public int getScore() {
		int score = 0;
		
		for (Card card : myCards) {
			score += card.getValue();
		}
		
		return score;
	};	
}
