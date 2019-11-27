import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

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
			 System.out.println(card.display());
		}
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
		Scanner input = new Scanner(System.in);
		
		System.out.println(this.role + ": You have drawn an ace. Should it count as 1 or 11?");
		
		while (aceValue != 1 && aceValue != 11) {
			System.out.print("Please enter '1' or '11': ");
	
			try {
				aceValue = input.nextInt();
			} catch (InputMismatchException e) {
			}
		}
		
		input.close();
	
		return aceValue;
	};	
}
