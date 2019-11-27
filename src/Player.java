import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {

	private ArrayList<Card> myCards;

	private int decideAceValue() {
		int aceValue = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("You have drawn an ace. Should it count as 1 or 11?");
		
		while (aceValue != 1 && aceValue != 11) {
			System.out.print("Please enter '1' or '11': ");

			try {
				aceValue = input.nextInt();
			} catch (InputMismatchException e) {
			}
		}
		
		input.close();

		return aceValue;
	}

	public Player() {
		 this.myCards = new ArrayList<>();
	};
	
	public void takeCard(Card card) {
		this.myCards.add(card);

		if (card.getType() == 'A') {
			card.setValue(this.decideAceValue());
		}
	}
	
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
