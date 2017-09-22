/*
	<Ameen Almiftah>		<6/3/2011>
*/


public class Card implements Comparable{
	private int value;
	private char suit;
	
    
	// card Initializing with face value and suit
	
	public Card(Integer v, Character s){
		value = v;
		suit = s;
	}
	
    
	// displaying face cards
	
	public String toString(){
		if(value==1){
			return String.format("A%c", suit);
		}else if(value==11){
			return String.format("J%c", suit);
		}else if(value==12){
			return String.format("Q%c", suit);
		}else if(value==13){
			return String.format("K%c", suit);
		}else{
			return String.format("%d%s", value, suit);
		}
	}
	
    
	// to compare between this and any given card by overriding compareTo method from the comparable interface
	
	public int compareTo(Object ob){
		Card c = (Card) ob;
		int a;
		if(c.suit < this.suit)
			a = 1;
		else if(c.suit > this.suit)
			a = -1;
		else{
			if(c.value > this.value)
				a = -1;
			else
				a = 1;
		}
		
		return a;	
		
	}
}
