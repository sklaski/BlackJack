public class Carddeck {

	private ArrayList<Card> cardsInDeck = new ArrayList<>();
	public int numberOfCards;
	
	public Carddeck() {
		this(52);
	}
	
	public Carddeck(int number) {
		this.numberOfCards = number; 
	}
	
	
}
