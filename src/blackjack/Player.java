package blackjack;

public class Player implements Credit, Actions {
	private String name;
	private double credit;
	
	public Player() {
		this.credit = CREDIT_AMOUNT;
	}

	@Override
	public double creditAmount() {
		return credit;
	}
	
	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
