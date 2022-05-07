package tutorial8.task1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CardPoolTest {

    private CardPool pool1;

    @BeforeEach
    public void setup() {
        pool1 = new CardPool();
        pool1.addCard(new PlayingCard("Hearts", 1));
        pool1.addCard(new PlayingCard("Clubs", 5));
        pool1.addCard(new PlayingCard("Spades", 4));
    }

    @Test
    void testCheckFaceCard() {
        PlayingCard card = pool1.checkFaceCard();
        assertEquals("Spades", card.getSuit());
        assertEquals(4, card.getValue());
    }

    @Test
    void testAddCard() {
        pool1.addCard(new PlayingCard("Diamonds", 6));
        PlayingCard card = pool1.checkFaceCard();
        assertEquals("Diamonds", card.getSuit());
        assertEquals(6, card.getValue());
    }

    @Test
    void testDrawCard() {
        // take the top card and check it
        PlayingCard card = pool1.drawCard();
        assertEquals("Spades", card.getSuit());
        assertEquals(4, card.getValue());
        // check the next card in the pool
        PlayingCard card2 = pool1.checkFaceCard();
        assertEquals("Clubs", card2.getSuit());
        assertEquals(5, card2.getValue());
    }
}
