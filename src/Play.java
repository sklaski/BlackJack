public class Play {

	public static void main(String[] args) {
		// Variabeln Deklaration
		Carddeck carddeck = new Carddeck();
		Card newCard;
		boolean gameover;
		
		
		while (true) {
		Player player = new Player();
		Dealer dealer = new Dealer();
		gameover = false;

			// Palyer takes first card
			newCard = carddeck.drawCard();
			player.takeCard(newCard);
			player.showCards();
			// Palyer takes second card
			newCard = carddeck.drawCard();
			player.takeCard(newCard);
			player.showCards();
			System.out.println("Your new score is: " + player.getScore());

			// Dealer takes first card
			newCard = carddeck.drawCard();
			dealer.takeCard(newCard);
			dealer.showCards();
			// Dealer takes second card
			newCard = carddeck.drawCard();
			dealer.takeCard(newCard);
			dealer.showCards();

			// The play
			while (player.getScore() <= 21) {
				// Player decides if he wants to take another card
				System.out.println("Do you want to take another card? (Please answer with y(es) or n(o)):");
				String input = IO.getStdinScanner().next();

				// Get another card
				if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
					newCard = carddeck.drawCard();
					player.takeCard(newCard);
					player.showCards();
					System.out.println("Your new score is: " + player.getScore());
				}

				// Stop
				else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
					System.out.println("Ok, no card.");
					break;
				}

				// Invalid input
				else
					System.out.println("invalid input, please try again");
			}

			if (player.getScore() > 21) {
				System.out.println("Sorry, you lost!");
				gameover = true;
//				System.exit(0);
			}

			// Dealer's Play
			dealer.unhideCards();
			dealer.showCards();

			// Dealer takes a card as long as the score is or is under 16
			while (gameover == false && dealer.getScore() <= 16) {
				newCard = carddeck.drawCard();
				dealer.takeCard(newCard);
				dealer.showCards();
				System.out.println("The Dealer's score is: " + dealer.getScore());
			}

			// Who is the winner after end of game
			if (gameover == false && dealer.getScore() > 21) {
				System.out.println("Yeah, you won!");
				gameover = true;
//				System.exit(0);
			}
			if (gameover == false && dealer.getScore() > player.getScore()) {
				System.out.println("Sorry, you lost!");
			} else if (dealer.getScore() < player.getScore()) {
				System.out.println("Yeah, you won!");
			} else
				System.out.println("Draw!");

			System.out.println("Do you want to play again? Please answer with y(es) or n(o)):");
			String input = IO.getStdinScanner().next();
			if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
				System.out.println("Goodbye!");
				System.exit(0);
			} else {
				System.out.println("-".repeat(60));
			}
		}
	}

}
