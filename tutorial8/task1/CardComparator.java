package tutorial8.task1;

import java.util.Comparator;

public class CardComparator implements Comparator<PlayingCard> {
    public int compare(PlayingCard card1, PlayingCard card2) {
        int suitComparison = card1.getSuit().compareTo(card2.getSuit());
        if (suitComparison != 0) {
            return suitComparison;
        }
        return card1.compareTo(card2);
    }
}
