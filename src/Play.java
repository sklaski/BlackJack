import java.io.*;

public class Play {

	public static void main(String[] args) throws IOException{
		// Variabeln Deklaration
		
		/*CardDeck carddeck = new CardDeck;
		Player player = new Player;
		Dealer dealer = new Dealer;*/

		//Start Spiel

		/*player.takeCard();
		dealer.takeCard();*/
		
		InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    System.out.print("Do you want to take another card? (Please answer with yes or no):");
	    String input = br.readLine();
	    System.out.println("You entered: " + input);
	  }

	}
