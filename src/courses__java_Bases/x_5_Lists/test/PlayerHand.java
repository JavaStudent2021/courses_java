package courses__java_Bases.x_5_Lists.test;

import java.util.ArrayList;

public class PlayerHand {
    private ArrayList<Card> cards = new ArrayList<>();
    private String namePlayer;

    private PlayerHand(String namePlayer) {
        this.namePlayer = namePlayer;
    }
}
