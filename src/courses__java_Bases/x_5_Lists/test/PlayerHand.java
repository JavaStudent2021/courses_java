package courses__java_Bases.x_5_Lists.test;

import java.util.ArrayList;

public class PlayerHand {
    ArrayList<Card> cards = new ArrayList<>();
    String namePlayer;

    public PlayerHand(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }


    public void setCards(Card card) {
        this.cards.add(card);
    }

    int sum() {
        int sum =0;
        for (int i = 0; i < cards.size(); i++) {
             sum +=cards.get(i).getRank();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "PlayerHand{" +
                " namePlayer =" + namePlayer +
                ", cards='" + cards + '\'' +
                '}';
    }
}
