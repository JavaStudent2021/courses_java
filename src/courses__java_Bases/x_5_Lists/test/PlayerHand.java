package courses__java_Bases.x_5_Lists.test;

import java.util.ArrayList;

public class PlayerHand {
    private ArrayList<Card> cards = new ArrayList<>();
    private String namePlayer;

    protected PlayerHand(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public int sumCards() {
        int sum = 0;
        for (int i = 0; i < cards.size(); i++) {
            sum += cards.get(i).getRank();
        }
        return sum;
    }

    public void setCards(Card card) {
        this.cards.add(card);
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    @Override
    public String toString() {
        return "{" + // PlayerHand
                "User = '" + namePlayer + '\'' +
                "\ncards = " + cards +
                "}\n----------------------------------";
    }
}
