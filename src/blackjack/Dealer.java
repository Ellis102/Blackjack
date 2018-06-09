package blackjack;

public class Dealer implements Credit, Actions{
	private double credit;
	
	
	public Dealer() {
		this.credit = CREDIT_AMOUNT;
	}
	@Override
	public double creditAmount() {
		return credit;
	}
	
	public void dealCards() {
		
	}
	@Override
	public boolean hitStickOrSplitCards() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean hitOrStick() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void deductFunds(double bet) {
		credit = credit - bet;
		
	}
	@Override
	public void addFunds(double bet) {
		credit = credit + bet;
	}

}
