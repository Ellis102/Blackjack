package blackjack;

public interface Actions {

	/**
	 * Allow player/Dealer to provide whether they want
	 * split their cards.
	 * @return
	 */
	boolean hitStickOrSplitCards();
	
	/**
	 * Allow the player/dealer to hit or stick with
	 * their cards
	 * @return
	 */
	boolean hitOrStick();
	
}
