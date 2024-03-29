import java.util.ArrayList;
import java.util.InputMismatchException;

public abstract class Participant {
	protected ArrayList<Card> myCards;
	protected String role;

	public Participant() {
		 this.myCards = new ArrayList<>();
	};

	public abstract void takeCard(Card card);
	
	public void showCards() {
		System.out.println(this.role + " has cards: ");
		
		for (Card card : myCards) {
			 System.out.print(card.display() + " ");
		}
		System.out.println();
		System.out.println();
	}
	
	public int getScore() {
		int score = 0;
		
		for (Card card : myCards) {
			if (!card.isHidden()) {
				score += card.getValue();
			}
		}
		
		return score;
	}

	protected int decideAceValue() {
		int aceValue = 0;
		
		System.out.println(this.role + ": You have an ace. Should it count as 1 or 11?");
		
		while (aceValue != 1 && aceValue != 11) {
			System.out.print("Please enter '1' or '11': ");
	
			try {
				aceValue = IO.getStdinScanner().nextInt();
			} catch (InputMismatchException e) {
				IO.getStdinScanner().next();
			}
		}
		
		return aceValue;
	};	
}
