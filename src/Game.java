/*
	<Ameen Almiftah>		<6/3/2011>
*/



import java.util.Random;
public class Game {
	private CardDeck deck;
	private CardHand players[] = new CardHand[4];

	
	// Initializing game with 4 hands and 13 random cards to each hand

	public Game(){
		players[0] = new CardHand("South");
		players[1] = new CardHand("West");
		players[2] = new CardHand("North");
		players[3] = new CardHand("East");
		deck = new CardDeck();
		Random ran = new Random();
		int temp;

		for(int i=0; i<4;i++)
			for(int j=1;j<=13; j++){
				temp = ran.nextInt(4);
				if(players[temp].cardInHand() < 13){
					players[temp].giveCard(deck.getCard());
				}else{
					j--;
				}

			}

	}

	
	// to show all four hands to the user
	
	public void showHands(){
		players[0].displayHand();
		players[1].displayHand();
		players[2].displayHand();
		players[3].displayHand();
	}


}


