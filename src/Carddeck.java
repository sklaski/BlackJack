import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//import com.sun.tools.javac.launcher.Main;

public class Carddeck {

	private ArrayList<Card> cardsInDeck = new ArrayList<>();

	public Carddeck() {
		HashMap<Character, Integer> cardValue = new HashMap<Character, Integer>();
		char[] type = new char[13]; // Array for type (ass, 2 - 9, ten, jack, queen, king)
		type[0] = 'a'; // element[0]: ass
		cardValue.put(type[0], 1); // Value for ass: 1
		for (int i = 1; i < 9; i++) {
			type[i] = (char) ('1' + i); // element[1..8]: 2-9
			cardValue.put(type[i], i + 1); // Value for numbers: number
		}
		int j = 9;
		for (char c : new char[] {'0', 'j', 'q', 'k' }) {
			type[j] = c; // element[9..11]: jack, queen, king
			cardValue.put(type[j], 10); // Value for "pictures": 10
			j++;
		}
		for (char c : new char[] { '\u2666', '\u2665', '\u2660', '\u2663' }) {
			for (char t : type) {
			String tout = "" + t;
			String cout = "" + c;
//			System.out.print(tout + cout + cardValue.get(t) + " ");

				addCard(t, c, cardValue.get(t));
			}
//			System.out.println();

		}
		shuffleDeck();
//		System.out.println(cardsInDeck.toString());

	}

	private void addCard(char cardType, char cardColor, Integer cardValue) {
		Card card = new Card(cardColor, cardType, cardValue);
//		Card card = new Card(cardColor, 'a', 1);

		cardsInDeck.add(card);
	}

	private void shuffleDeck() {
		Collections.shuffle(cardsInDeck);
	}

	public Card drawCard() {
		if (cardsInDeck.size() > 0) {		
			Card firstCardInDeck = cardsInDeck.get(0);
			cardsInDeck.remove(0);
			

			return firstCardInDeck;
		} else {
			return null;
		}
	}

	public static void main(String[] args) {

//		new Carddeck();

	}
}