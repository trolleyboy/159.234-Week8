package tutorial8.task1;

import java.util.ArrayList;

public class SimpleCardGame {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        PlayingCard card = null;
        ArrayList<PlayingCard> player1Hand = new ArrayList<PlayingCard>();
        ArrayList<PlayingCard> player2Hand = new ArrayList<PlayingCard>();
        int player1Score = 0;
        int player2Score = 0;
        for (int i = 0; i < 3; i++) {
            card = deck.dealNext();
            player1Hand.add(card);
            player1Score += card.getValue();
            card = deck.dealNext();
            player2Hand.add(card);
            player2Score += card.getValue();
        }
        System.out.println("Player 1 hand " + player1Hand);
        System.out.println("Player 2 hand " + player2Hand);
        System.out.println("Player 1 scored " + player1Score +
                " Player 2 scored " + player2Score);
    }
}
