package courses__java_Bases.x_5_Lists.test;

import java.util.ArrayList;
import java.util.Random;

public class Deck{
    ArrayList<Card> deck  = new ArrayList<>();

    public Deck() {
        deck.add(new Card("1", 1));
        deck.add(new Card("2", 2));
        deck.add(new Card("3", 3));
        deck.add(new Card("4", 4));
        deck.add(new Card("5", 5));
        deck.add(new Card("6", 6));
        deck.add(new Card("7", 7));
        deck.add(new Card("8", 8));
        deck.add(new Card("9", 9));
        deck.add(new Card("10", 10));
        deck.add(new Card("V", 10));
        deck.add(new Card("D", 10));
        deck.add(new Card("K", 10));
        deck.add(new Card("T", 10));

    }

    Card backCard(){
        Random random = new Random();
        int random_One_Card = random.nextInt(deck.size());
        Card card = deck.get(random_One_Card);
        deck.remove(random_One_Card);
        return card;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck +
                '}';
    }
}
