import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {

	private ArrayList<Card> myCards;

	private int decideAceValue() {
		int aceValue = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Du hast ein Ass gezogen. Soll dies jetzt den Wert 1 oder 11 haben?");
		
		while (aceValue != 1 && aceValue != 11) {
			System.out.print("Bitte gebe '1' oder '11' ein: ");

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
