/*
	<Ameen Almiftah>		<6/3/2011>
*/


public class CardHand {
	private LinkedList PlayerHand;
	private String PlayerName;
	private int cardHand;
	
    
	// hand initializing
	
	public CardHand(String name){
		PlayerHand = new LinkedList();
		PlayerName = name;
		cardHand = 0;
	}
	
    
	// Show cards in hand

	public void displayHand(){
		System.out.println(String.format("Player: %s", PlayerName));
		PlayerHand.traverse();
		System.out.println();
	}
	
    
	// deal a card to hand
	
	public void giveCard(Card c){
		if(!PlayerHand.contains(c)){
			PlayerHand.add(c);
			cardHand++;
		}
	}
	
    
	// to return number of cards in a hand
	
	public int cardInHand(){
		return cardHand;
	}
}
