package tutorial8.task1;

import java.util.*;

public class DeckOfCards {

    private LinkedList<PlayingCard> deck = new LinkedList<PlayingCard>();

    public static final int FRENCH_SUIT = 1;
    public static final int LATIN_SUIT = 2;
    public static final int BRISCA_SUIT = 3;
    public static final int GERMANIC_SUIT = 4;

    public static final String[] SUITS = { "Hearts", "Diamonds", "Spades", "Clubs" };
    public static final String[] LATIN_SUITS = { "Swords", "Chalices", "Coins", "Clubs" };
    public static final String[] BRISCA_SUITS = { "Gold", "Swords", "Cups", "Clubs" };
    public static final String[] GERMANIC_SUITS = { "Bells", "Acorns", "Leaves", "Hearts" };
    public static final int SUIT_SIZE = 13;
    public static final int NUMBER_OF_SUITS = 4;

    private String[] suitType;

    public DeckOfCards() {
        this(1);
    }

    public DeckOfCards(int deckType) {
        switch (deckType) {
            case FRENCH_SUIT: 
                suitType = SUITS;
                break;
            case LATIN_SUIT:
                suitType = LATIN_SUITS;
                break;
            case BRISCA_SUIT:
                suitType = BRISCA_SUITS;
                break;
            case GERMANIC_SUIT:
                suitType = GERMANIC_SUITS;
                break;
        }
        for (int suitCount = 0; suitCount < NUMBER_OF_SUITS; suitCount++) {
            for (int suitIndex = 0; suitIndex < SUIT_SIZE; suitIndex++) {
                deck.add(new PlayingCard(suitType[suitCount], suitIndex + 1));
            }
        }
    }

    private LinkedList<PlayingCard> getDeck() {
        return deck;
    }

    public PlayingCard dealNext() {
        return deck.removeFirst();
    }

    public void shuffle() {
        Collections.shuffle(getDeck());
    }

    public void sort() {
        Collections.sort(deck, new CardComparator());
    }

    public static void main(String[] args) {
        DeckOfCards cardDeck = new DeckOfCards(2);
        cardDeck.shuffle();
        Iterator<PlayingCard> iter = cardDeck.getDeck().iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        cardDeck.sort();
        System.out.println("Sorted Cards:");
        iter = cardDeck.getDeck().iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
