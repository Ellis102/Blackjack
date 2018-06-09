package blackjack;

public interface Credit {
	static final double CREDIT_AMOUNT = 100;
	/**
	 * Check how much credit left for the dealer
	 * and player
	 * @return double - credit amount
	 */
	double creditAmount();
	
	/**
	 * Remove betted amount from player/dealer
	 */
	void deductFunds(double bet);
	
	/**
	 * Add betted amount to player/dealer
	 */
	void addFunds(double bet);
}
