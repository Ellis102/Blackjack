package blackjack;

public class Bank {
	private int credit;
	private static final int CREDIT_AMOUNT = 100;
	
	public Bank() {
		this.credit = CREDIT_AMOUNT;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	
}
