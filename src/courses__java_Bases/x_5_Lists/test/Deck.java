package courses__java_Bases.x_5_Lists.test;

import java.util.ArrayList;
import java.util.Collections;
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
        deck.add(new Card(Suit.DIAMONDS,"6", 6));
        deck.add(new Card(Suit.DIAMONDS,"7", 7));
        deck.add(new Card(Suit.DIAMONDS,"8", 8));
        deck.add(new Card(Suit.DIAMONDS,"9", 9));
        deck.add(new Card(Suit.DIAMONDS,"10", 10));
        deck.add(new Card(Suit.DIAMONDS,"V", 10));
        deck.add(new Card(Suit.DIAMONDS,"D", 10));
        deck.add(new Card(Suit.DIAMONDS,"K", 10));
        deck.add(new Card(Suit.DIAMONDS,"T", 10));
        deck.add(new Card(Suit.DIAMONDS,"J", 10));

        deck.add(new Card(Suit.HEARTS,"2", 2));
        deck.add(new Card(Suit.HEARTS,"3", 3));
        deck.add(new Card(Suit.HEARTS,"4", 4));
        deck.add(new Card(Suit.HEARTS,"5", 5));
        deck.add(new Card(Suit.HEARTS,"6", 6));
        deck.add(new Card(Suit.HEARTS,"7", 7));
        deck.add(new Card(Suit.HEARTS,"8", 8));
        deck.add(new Card(Suit.HEARTS,"9", 9));
        deck.add(new Card(Suit.HEARTS,"10", 10));
        deck.add(new Card(Suit.HEARTS,"V", 10));
        deck.add(new Card(Suit.HEARTS,"D", 10));
        deck.add(new Card(Suit.HEARTS,"K", 10));
        deck.add(new Card(Suit.HEARTS,"T", 10));
        deck.add(new Card(Suit.HEARTS,"J", 10));

        Collections.shuffle(deck);
    }


    Card distributeOneCard(){
        Card d = deck.remove(0);
        System.out.println("d = " + d);
        return d;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck +
                '}';
    }
}
