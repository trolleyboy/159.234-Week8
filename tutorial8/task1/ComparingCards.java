package tutorial8.task1;

public class ComparingCards {
    public static void main(String[] args) {
        PlayingCard card1 = new PlayingCard("Hearts", 1);
        PlayingCard card2 = new PlayingCard("Diamonds", 13);
        int compare = card1.compareTo(card2);
        if (compare > 0) {
            System.out.println(card1 + " scores more than " +
                    card2);
        } else {
            if (compare < 0) {
                System.out.println(card1 + " scores less than " +
                        card2);
            } else {
                System.out.println(card1 + " scores the same as " +
                        card2);
            }
        }
    }
}
