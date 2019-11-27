import java.util.InputMismatchException;
import java.util.Scanner;

public class Player extends Participant {

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
	
	@Override
	public void takeCard(Card card) {
		card.setHidden(false);
		this.myCards.add(card);

		if (card.getType() == 'A') {
			card.setValue(this.decideAceValue());
		}
	}

}
