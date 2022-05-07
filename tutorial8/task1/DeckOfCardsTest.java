package tutorial8.task1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class DeckOfCardsTest {

    @Test
    public void testFrenchDeckOfCards() {
        DeckOfCards deck = new DeckOfCards(1);
        PlayingCard card = deck.dealNext();
        assertEquals("Hearts", card.getSuit());
    }

    @Test
    public void testLatinDeckOfCards() {
        DeckOfCards deck = new DeckOfCards(2);
        PlayingCard card = deck.dealNext();
        assertEquals("Swords", card.getSuit());
    }

    @Test
    public void testBriscaDeckOfCards() {
        DeckOfCards deck = new DeckOfCards(3);
        PlayingCard card = deck.dealNext();
        assertEquals("Gold", card.getSuit());
    }

    @Test
    public void testGermanicDeckOfCards() {
        DeckOfCards deck = new DeckOfCards(4);
        PlayingCard card = deck.dealNext();
        assertEquals("Bells", card.getSuit());
    }
}
