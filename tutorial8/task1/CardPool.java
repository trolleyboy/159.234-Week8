package tutorial8.task1;

import java.util.ArrayDeque;

public class CardPool {
    
    // attributes
    private ArrayDeque<PlayingCard> pool;


    // constructors
    public CardPool() {
        pool = new ArrayDeque<PlayingCard>();
    }

    // methods
    public PlayingCard drawCard() {
        return pool.removeFirst();
    }

    public void addCard(PlayingCard card) {
        pool.addFirst(card);
    }

    public PlayingCard checkFaceCard() {
        return pool.peekFirst();
    }

}
