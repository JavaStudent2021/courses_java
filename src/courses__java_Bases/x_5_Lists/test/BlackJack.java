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

        for (int i = 0; i < leghtPlayer; i++) {
            System.out.println("Введите играка: ");
            String namePlayer = reader.readLine();
            playerHand.add(new PlayerHand(namePlayer));
            playerHand.get(i).setCards(deck.backCard());
            playerHand.get(i).setCards(deck.backCard());
            System.out.println("Играку " + playerHand.get(i) + " карты розданы.");
            System.out.println(playerHand.get(i));
            System.out.println("Сумма карт: " + playerHand.get(i).sum());
        }
        boolean playerGame = false;
        while (!playerGame) {
            for (int i = 0; i < playerHand.size(); i++) {
                if (playerHand.get(i).sum() < 21) {
                    System.out.println("---------------------------------------------");

                    System.out.println("Сумма карт " + playerHand.get(i).namePlayer + ": " + playerHand.get(i).sum());

                    System.out.println("Продолжаем ? если 'ДА' то y, если 'НЕТ' тогда n");
                    String charN = reader.readLine();

                    if (charN.equals("y")) {
                        playerGame = false;
                        boolean bl = false;
                        while (!bl) {
                            if (playerHand.get(i).sum() < 21) {
                                bl = false;
                                System.out.println("Выдать карту нажать '1', если нет '0'");
                                String status = reader.readLine();
                                switch (status) {
                                    case "1":
                                        playerHand.get(i).setCards(deck.backCard());
                                        System.out.println("Сумма карт " + playerHand.get(i).namePlayer + ": " + playerHand.get(i).sum());
                                        break;
                                    case "0":
                                        bl = true;
                                        break;
                                }

                            } else {
                                bl = true;
                            }
                        }

                    } else if (charN.equals("n")) {
                        playerGame = true;
                    } else {
                        System.out.println("Вы ввели неправильный символ.");
                        break;
                    }
                }
            }


        }
        playerHand.forEach(e -> System.out.println("User : " + e.namePlayer + "; sum " + e.sum()));

        int x = 0;
        for (int i = 1; i < playerHand.size(); i++) {
            x = (playerHand.get(i - 1).sum() >= playerHand.get(i).sum()) ? i : i;
        }
        System.out.println("User : " + playerHand.get(x).namePlayer + "; sum " + playerHand.get(x).sum() + "Bingo!!!!!");

        int q = 0;
        for (int i = 1; i < playerHand.size(); i++) {
            int y = playerHand.get(i).sum();
            q = res(q, y);
        }
        System.out.println("User : " + "; sum " + q + "Bingo!!!!!");


    }

    static int res(int x, int y) {
        int result = 0;
        if (x - 21 <= 0 & y - 21 <= 0) {
            result = x > y ? x : y;
        } else if (x - 21 <= 0) {
            result = x;
        } else if (y - 21 <= 0) {
            result = y;
        }
        return result;
    }
}