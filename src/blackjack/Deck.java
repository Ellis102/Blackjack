package blackjack;

import java.util.ArrayList;

/**
 * Created by Andrew Ellis-Moseley on 02/12/2017.
 */

public class Deck {
    final static String[] SUIT_FACE = {"Hearts", "Spades", "Diamonds", "Clubs"};
    private static final int NUMBER_OF_DECKS = 6;
    private ArrayList<Card> deck;
    private int deckIndex;

    /**
     * This creates the deck of cards
     */
    public Deck(){
    		deck = new ArrayList<Card>();
        deckIndex=0;
        for (int i=0; i<NUMBER_OF_DECKS;i++) {
	        for(String suit: SUIT_FACE){
	            for (Face r : Face.values()) {
	                Card card = new Card(suit, r);
	                deck.add(card);
	                deckIndex++;
	            }
	        }
        }
        deckIndex=0;
    }

    /**
     * This shuffles the deck of cards
     */
    public void shuffleDeck() {
    	System.out.println("deck size: " + deck.size());
        for (int i=0; i<1000; i++) {
            int randomValueOne = (int)(Math.random() * deck.size());
            int randomValueTwo = (int)(Math.random() * deck.size());
            Card temp = deck.get(randomValueOne);
            deck.set(randomValueOne, deck.get(randomValueTwo));
            deck.set(randomValueTwo, temp);
        }
    }

    /**
     * This returns the next card in the deck
     * @return
     */
    public Card getNext(){
        Card result = deck.get(deckIndex);
        deckIndex=deckIndex+1;
        return result;
    }

    /**
     * This returns the current card in the deck
     * @return
     */
    public Card getCurrent(){
        return deck.get(deckIndex);
    }

    /**
     * This returns the previous card in the deck
     * @return
     */
    public Card getPrevious() {
        if (deckIndex == 0) {
            return null;
        }
        return deck.get(deckIndex -1);
    }
}

