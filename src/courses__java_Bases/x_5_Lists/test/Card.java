package courses__java_Bases.x_5_Lists.test;

public class Card {
    private Suit suit; // масть
    private String dignity; //достотнство
    private int rank; // стоимостьо

    public int getRank() {
        return rank;
    }

    public Card(Suit suit, String dignity, int rank) {
        this.suit = suit;
        this.dignity = dignity;
        this.rank = rank;

    }

    @Override
    public String toString() {
        return "\n\tCard{\n" +
                "\t\tsuit = " + suit +
                "\n\t\tdignity = " + dignity +
                "\n\t\trank = " + rank +
                "\n}";
    }
}
