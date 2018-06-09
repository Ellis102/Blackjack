package blackjack;

/**
 * Created by Andrew Ellis-Moseley on 02/12/2017.
 */

public class Card {
    private String suit;
    private Face face;

    public Card(String suit, Face face) {
        this.suit = suit;
        this.face = face;
    }

    /**
     * Getter for suit
     * @return
     */
    public String getSuit() {
        return suit;
    }
    /**
     * Setter for suit
     * @param suit
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }
    /**
     * Getter for face
     * @return
     */
    public Face getFace() {
        return face;
    }
    /**
     * Setter for face
     * @param face
     */
    public void setFace(Face face) {
        this.face = face;
    }

    /**
     * Override for toString return card as string eg: Ten of Spades
     * @return
     */
    @Override
    public String toString(){
        return this.face+" of "+ this.getSuit();
    }

}

