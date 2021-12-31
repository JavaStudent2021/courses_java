package courses__java_Bases.x_5_Lists.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BlackJack {
    public static void main(String[] args) throws IOException {
        Deck deck = new Deck();
        ArrayList<PlayerHand> playerHand = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество играков: ");
        int leghtPlayer = Integer.parseInt(reader.readLine());

    }
}