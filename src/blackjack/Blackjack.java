package blackjack;

import java.util.Scanner;

public class Blackjack {
	
	Scanner input = new Scanner(System.in);
	Player player = new Player();
	Dealer dealer = new Dealer();
	
	public Blackjack() {
		System.out.println("********************************************************");
		System.out.println("Welcome to awesome Blackjack!\n");
		System.out.println("Please select from one of the following options.\n");
		System.out.println("1) Start");
		System.out.println("2) Help\n");
		System.out.println("********************************************************\n");
		System.out.print("Please enter your name: ");
		String name = input.nextLine();
		player.setName(name);
		System.out.println("Welcome " + player.getName() + " Let's Play!");		
	}
	
	/**
	 * Handles running each round of the game
	 */
	public void play() {
		System.out.print("How much would you like to be?");
		double bet = input.nextDouble();
		player.deductFunds(bet);
		System.out.println("PLayer has: " + player.creditAmount() + " of credit left");
	}
	
	/**
	 * Checks whether the player wants to start a new round
	 * of blackjack
	 * @return boolean true if y/yes, else false
	 */
	public boolean startNewRound(){

	    while(true){
	        System.out.println("Would you like to play another round? \"yes\"/\"no\": ");
	        String answer = input.nextLine();
	        answer = answer.toLowerCase();

	        switch(answer){
	            case "y":
	            case "yes":
	                return true;
	            case "n":
	            case "no":
	            	System.out.print("Thank you " + player.getName() + " for playing CommandLine BlackJack!");
	                return false;
	            default:
	                System.out.println("Invalid answer. Please answer only \"yes\" or \"no\"");
	                break;
	        }
	        System.out.println();
	    }
	}

}
