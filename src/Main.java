/*
	<Ameen Almiftah>		<6/3/2011>
	<Random Card Dealer>
	<this code deals a card deck to four players using liked list method. I tried to make it as generic as possible. worked with Ali Alhashim>
*/


import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String agree;
		do{
			Game round = new Game();
			round.showHands();
			System.out.print("play again? [y/n] ");
			agree = input.next();
		}while( (agree.equals("y") || agree.equals("Y")) );

	}
}
