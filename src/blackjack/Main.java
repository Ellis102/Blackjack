package blackjack;

public class Main {

	public static void main(String[] args) {				
		Deck deck = new Deck(); //Build deck of cards		
        deck.shuffleDeck(); //Shuffle deck of cards
        
        //Create main game 
		Blackjack blackjack = new Blackjack();
		
		/**
		 * Game will continue to run until either the player
		 * runs out of money or requests to quit.
		 */
		do {
			blackjack.play();
		} while (blackjack.startNewRound());
		
	}

}
