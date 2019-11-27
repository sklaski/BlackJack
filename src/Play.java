import java.util.Scanner;

public class Play {

	public static void main(String[] args) {
		// Variabeln Deklaration

		Player player = new Player();
		Dealer dealer = new Dealer();
		Carddeck carddeck = new Carddeck();
		Card newCard;

		// Palyer takes first card
		newCard = carddeck.drawCard();
		player.takeCard(newCard);
		player.showCards();
		// Palyer takes second card
		newCard = carddeck.drawCard();
		player.takeCard(newCard);
		player.showCards();

		// Dealer takes first card
		newCard = carddeck.drawCard();
		dealer.takeCard(newCard);
		dealer.showCards();
		// Dealer takes second card
		newCard = carddeck.drawCard();
		dealer.takeCard(newCard);
		dealer.showCards();
		
		//The play
		while (player.getScore() <= 21) {
			// Player decides if he wants to take another card
			Scanner myObj = new Scanner(System.in);
			System.out.println("Do you want to take another card? (Please answer with yes or no):");
			String input = myObj.nextLine();

			// Get another card
			if (input.equalsIgnoreCase("yes")) {
				newCard = carddeck.drawCard();
				player.takeCard(newCard);
				player.showCards();
				System.out.println("Your new score is: " + player.getScore());
			}

			// Stop
			else if (input.equalsIgnoreCase("no")) {
				System.out.println("Ok, no card.");
				break;
			}

			// Invalid input
			else
				System.out.println("invalid input, please try again");
		}
		
		if (player.getScore() > 21) {
			System.out.println("Player = Loser");
			System.exit(0);
		
		}
		
		if (player.getScore() == 21) {
			System.out.println("Player = Winner");
			System.exit(0);
		}
		
		

		// Dealer's Play
		dealer.unhideCards();
		dealer.showCards();
		
		// Dealer takes a card as long as the score is or is under 16
		while (dealer.getScore()<=16 ) {
			newCard = carddeck.drawCard();
			dealer.takeCard(newCard);
			dealer.showCards();
			System.out.println("Your new score is: " + dealer.getScore());
		}
		
		//Who is the winner after end of game
		if (dealer.getScore()>21) {
			System.out.println("Player = Winner");
			System.exit(0);
		}
		if (dealer.getScore()> player.getScore()) {
			System.out.println("Player = Loser");
		}
		else if (dealer.getScore()< player.getScore()) {
			System.out.println("Player = Winner");
		}
		else System.out.println("Draw!");
		
	}
}
