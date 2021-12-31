package courses__java_Bases.x_5_Lists.test;

public class Card {
    private Suit suit; // масть
    private String dignity; //достотнство
    private int rank; // стоимостьо

    public Card(Suit suit, String dignity, int rank) {
        this.suit = suit;
        this.dignity = dignity;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank=" + rank +
                '}';
    }
}
