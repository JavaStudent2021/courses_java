package courses__java_Bases.x_5_Lists.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BlackJack {
    public static void main(String[] args) {
        Deck deck = new Deck();
        ArrayList<PlayerHand> listPlayerHand = new ArrayList<>();

        //создание кол-ва играков
        listPlayerHand.addAll(enterNumberOfPlayers());
        System.out.println(listPlayerHand);
        //начальнаая раздача карт
        firstDistributionOfCards(listPlayerHand, deck);
        System.out.println(listPlayerHand);
        boolean goGame = false;
        int sumCards = 0;
        while (!goGame) {
            goGame = true;
            for (int i = 0; i < listPlayerHand.size(); i++) {
                sumCards = listPlayerHand.get(i).sumCards();
                System.out.println("user0 - " + listPlayerHand.get(i).getNamePlayer() + " сумма карт - " + sumCards);

                if (sumCards < 21) {
                    System.out.println("Выдать карту: ДА или НЕТ?");
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    try {
                        String go = checkWord(reader.readLine());
                        if (go.equals("y")) {
                            goGame = false;
                            //если кол-во очков меньше 21 и игрок хочет получить из колоды карту.
                            distributionOfCards(listPlayerHand.get(i), deck);
                            //System.out.println("user - " + listPlayerHand.get(i).getNamePlayer() + " сумма карт - " + sumCards);
                        } else if (go.equals("n")) {
                            goGame = true;
                        }

                    } catch (Exception e) {
                        System.out.println("Нужно ввести букву: 'y' или 'n'");
                    }
                }
            }
        }
    }


    static ArrayList enterNumberOfPlayers() {
        ArrayList<PlayerHand> listPlayerHand = new ArrayList<>();
        boolean users = false;
        while (!users) {
            System.out.println("Введите количество играков: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                int leghtPlayer = Integer.parseInt(reader.readLine());
                users = true;
                for (int i = 0; i < leghtPlayer; i++) {
                    System.out.println("Введите имя игрока: ");
                    String nameUser = reader.readLine();
                    listPlayerHand.add(new PlayerHand(nameUser));
                }

            } catch (Exception e) {
                System.out.println("Введенный символ не верный. Необходимо ввести целое число!.");
                users = false;
            }

        }
        return listPlayerHand;
    }

    static ArrayList firstDistributionOfCards(ArrayList<PlayerHand> listUser, Deck deck) {
        for (PlayerHand user : listUser) {
            user.setCards(deck.distributeOneCard());
            user.setCards(deck.distributeOneCard());
        }
        return listUser;
    }

    static void distributionOfCards(PlayerHand user, Deck deck) throws IOException s{
        user.setCards(deck.distributeOneCard());
        int sumCard = user.sumCards();
        System.out.println("user1 - " + user.getNamePlayer() + " сумма карт - " + sumCard);
        if (sumCard < 21) {
            System.out.println("Выдать карту: ДА или НЕТ?");
            String reader = new BufferedReader(new InputStreamReader(System.in)).readLine();
            String chek = checkWord(reader);
            if (chek.equals("y")) {
                distributionOfCards(user, deck);
            }else {
                System.out.println("user2_1 - " + user.getNamePlayer() + " сумма карт - " + sumCard);
            }
        }else {
            System.out.println("user2_2 - " + user.getNamePlayer() + " сумма карт - " + sumCard);
        }

    }

    static String checkWord(String word) {

        if (word.equals("y") || word.equals("n")) {
            return word;
        } else {
            try {
                System.out.println("Введите праавильный символ!!!!");
                word = new BufferedReader(new InputStreamReader(System.in)).readLine();
                checkWord(word);
            } catch (Exception e) {
                checkWord(word);
            }
        }
        return word;
    }
}