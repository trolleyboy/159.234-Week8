package tutorial8.task1;

public class Pontoon {
    
    public static void main(String[] args) {
        
        DeckOfCards deck = new DeckOfCards();
        Hand playerHand = new Hand();
        Hand dealerHand = new Hand();
        String winner = null;


        deck.shuffle();
        for (int i = 0; i < 3; i++) {
            playerHand.addCard(deck.dealNext());
            dealerHand.addCard(deck.dealNext());    
        }
        
        int playerHandTotal = playerHand.calculateHand();
        int dealerHandTotal = dealerHand.calculateHand();

        
        
        if (playerHandTotal > dealerHandTotal) {
            winner = "Player";
        } else {
            winner = "Dealer";
        }
        if (playerHandTotal > 21) {
            winner = "Dealer";
        }
        if (dealerHandTotal > 21) {
            winner = "Player";
        }
        if (playerHandTotal == dealerHandTotal || (playerHandTotal > 21 && dealerHandTotal > 21)) {
            winner = "Dealer";
        }
        
        System.out.println("Player Hand: ");
        System.out.println(playerHand.toString());
        System.out.println("Player Hand Total: " + playerHandTotal);

        System.out.println("Dealer Hand: ");
        System.out.println(dealerHand.toString());
        System.out.println("Dealer Hand Total: " + dealerHandTotal);

        System.out.println("Winner: " + winner);
    }

}
