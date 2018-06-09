package blackjack;

/**
 * Created by Andrew Ellis-Moseley on 02/12/2017.
 */

public enum Face {
    Ace(0),
    Two(1),
    Three(2),
    Four(3),
    Five(4),
    Six(5),
    Seven(6),
    Eight(7),
    Nine(8),
    Ten(9),
    Jack(10),
    Queen(11),
    King(12);

    int faceValue;

    /**
     * Setter for face value
     * @param faceValue
     */
    Face(int faceValue){
        this.faceValue = faceValue;
    }

    /**
     * Getter for face value
     * @return
     */
    public int getFaceValue(){
        return this.faceValue;
    }
}
