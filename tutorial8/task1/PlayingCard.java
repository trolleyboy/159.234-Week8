package tutorial8.task1;

public class PlayingCard implements Comparable<PlayingCard> {
    private String suit;
    private int value;

    public PlayingCard(String suit, int value) {
        setSuit(suit);
        setValue(value);
    }

    private void setSuit(String suit) {
        this.suit = suit;
    }

    private void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        String cardName;
        switch (value) {
            case 1:
                cardName = "Ace";
                break;
            case 11:
                cardName = "Jack";
                break;
            case 12:
                cardName = "Queen";
                break;
            case 13:
                cardName = "King";
                break;
            default:
                cardName = String.valueOf(getValue());
        }
        return cardName + " of " + suit;
    }

    @Override
    public int compareTo(PlayingCard card) {
        return this.getValue() - card.getValue();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null ||
                !(object.getClass().equals(this.getClass()))) {
            return false;
        }
        PlayingCard other = (PlayingCard) object;
        if (getValue() == other.getValue()) {
            return true;
        } else {
            return false;
        }
    }
}