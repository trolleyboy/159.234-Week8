package tutorial8.task1;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayingCardTestCase {
    @Test
    public void testLessThan() {
        PlayingCard card1 = new PlayingCard("Hearts", 1);
        PlayingCard card2 = new PlayingCard("Diamonds", 13);
        int compare = card1.compareTo(card2);
        assertTrue(compare < 0);
    }

    @Test
    public void testGreaterThan() {
        PlayingCard card1 = new PlayingCard("Hearts", 12);
        PlayingCard card2 = new PlayingCard("Diamonds", 4);
        int compare = card1.compareTo(card2);
        assertTrue(compare > 0);
    }

    @Test
    public void testSame() {
        PlayingCard card1 = new PlayingCard("Hearts", 11);
        PlayingCard card2 = new PlayingCard("Diamonds", 11);
        int compare = card1.compareTo(card2);
        assertTrue(compare == 0);
    }
}
