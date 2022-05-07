package tutorial8.task1;

import java.util.ArrayList;

public class Hand {
    
    // attributes
    private ArrayList<PlayingCard> hand = new ArrayList<PlayingCard>(3);
    // constructors

    // methods
    public int calculateHand() {
        int handValue = 0;
        for (PlayingCard card : hand) {
            if (card.getValue() > 10) {
                handValue += 10;
            } else {
                handValue += card.getValue();
            }
            
        }
        return handValue;
    }

    public void addCard(PlayingCard card) {
        hand.add(card);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Card 1: " + hand.get(0).toString() + "\nCard 2: " + hand.get(1).toString() + "\nCard 3: " + hand.get(2).toString() + "\n";
    }

    
}
