/*
	<Ameen Almiftah>		<6/3/2011>
*/


public class CardDeck {
	private LinkedList deckL;
	private int sum = 0;
	
    
	// deck Initializing

	public CardDeck(){
		deckL = new LinkedList();
		addCard('C');
		addCard('D');
		addCard('H');
		addCard('S');
		
	}
	
    
	// adding certain suit
	
	private void addCard(char  s){
		for(int i=1; i<=13; i++){
			Card card = new Card(i, s);
			if (!deckL.contains(card))
				deckL.add(card);
			sum ++;
		}		
	}
	
    
	// Dealing a card
	
	public Card getCard(){
		sum --;
		return (Card) deckL.get();
	}
	
    
	// Display the deck
	
	public void display(){
		deckL.traverse();
	}
}
