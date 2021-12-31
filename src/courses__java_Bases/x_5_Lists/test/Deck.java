package courses__java_Bases.x_5_Lists.test;

import java.util.ArrayList;
import java.util.Random;

public class Deck{
    private ArrayList<Card> deck = new ArrayList<>();

    public Deck() {
        deck.add(new Card(Suit.CLUBS,"2", 2));
        deck.add(new Card(Suit.CLUBS,"3", 3));
        deck.add(new Card(Suit.CLUBS,"4", 4));
        deck.add(new Card(Suit.CLUBS,"5", 5));
        deck.add(new Card(Suit.CLUBS,"6", 6));
        deck.add(new Card(Suit.CLUBS,"7", 7));
        deck.add(new Card(Suit.CLUBS,"8", 8));
        deck.add(new Card(Suit.CLUBS,"9", 9));
        deck.add(new Card(Suit.CLUBS,"10", 10));
        deck.add(new Card(Suit.CLUBS,"V", 10));
        deck.add(new Card(Suit.CLUBS,"D", 10));
        deck.add(new Card(Suit.CLUBS,"K", 10));
        deck.add(new Card(Suit.CLUBS,"T", 10));
        deck.add(new Card(Suit.CLUBS,"J", 10));

        deck.add(new Card(Suit.DIAMONDS,"2", 2));
        deck.add(new Card(Suit.DIAMONDS,"3", 3));
        deck.add(new Card(Suit.DIAMONDS,"4", 4));
        deck.add(new Card(Suit.DIAMONDS,"5", 5));
    }

    Card distributeOneCard(){
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
