package courses_java_BlackJack.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BlackJack {
    public static void main(String[] args) {
        Deck deck = new Deck();
        ArrayList<PlayerHand> listPlayerHand = new ArrayList<>();

        //создание кол-ва играков
        listPlayerHand.addAll(enterNumberOfPlayers());
        //System.out.println(listPlayerHand);
        //начальнаая раздача карт
        firstDistributionOfCards(listPlayerHand, deck);
        //listPlayerHand.forEach(user -> System.out.println(user));
        boolean goGame = false;
        int sumCards = 0;
        while (!goGame) {
            goGame = true;
            for (int i = 0; i < listPlayerHand.size(); i++) {
                sumCards = listPlayerHand.get(i).sumCards();

                System.out.println("user0 - " + listPlayerHand.get(i).getNamePlayer() + " сумма карт - " + sumCards);
                System.out.println("Продолжаем играть введите: Пропуск, Добрать, Удвоить, Разделить, Сдаться?");

                String choice = null;
                try {
                    choice = action(new BufferedReader(new InputStreamReader(System.in)).readLine());
                } catch (IOException e) {
                    System.out.println("Что-то пошло не так!!!!!!!!!!!!!!!");
                }

                switch (choice) {
                    case "Добрать": {
                        pickUp(listPlayerHand.get(i), deck); // Добрать
                        break;
                    }
                    case "Удвоить": {
                        doub(listPlayerHand.get(i)); // Удвоить
                        break;
                    }
                    case "Разделить": {
                        divide(listPlayerHand.get(i)); //Разделить
                        break;
                    }

                    case "Пропуск": {
                        goGame = skip(listPlayerHand.get(i)); //Пропуск
                        break;
                    }
                    case "Сдаться": {
                        goGame = surrender(listPlayerHand.get(i), listPlayerHand); //Сдаться
                        break;
                    }
                    default: {
                        System.out.println("default");
                    }

                }                //System.out.println("Нужно ввести букву: 'y' или 'n'");
            }
        }
        checkWinnerOfPoints(listPlayerHand);
    } // System.out.println("pickUp - " + user.getNamePlayer() + " сумма карт - " + user.sumCards() + "НЕ ПОЛОЖЕНО!!!!!!!!!");

    private static boolean skip(PlayerHand user) {
        return true;
    }

    private static void pickUp(PlayerHand user, Deck deck) {
        if (user.sumCards() < 21) {
            distributionOfCards(user, deck);
        }
    }

    private static void doub(PlayerHand user) {
    }

    private static void divide(PlayerHand user) {
    }

    private static boolean surrender(PlayerHand user, List list) {
        list.remove(user);
        return true;
    }

    static String action(String word) {
        if (word.equals("Пропуск") || word.equals("Добрать") || word.equals("") || word.equals("") || word.equals("")) {
            return word;
        } else {
            try {
                word = new BufferedReader(new InputStreamReader(System.in)).readLine();
                action(word);
            } catch (Exception e) {
                System.out.println("Введите верный выбор!!!!");
                action(word);
            }
        }
        return word;
    }

    static void checkWinnerOfPoints(ArrayList<PlayerHand> list) {
        PlayerHand user = null;
        Map<PlayerHand, Integer> listWinner = new HashMap<>();
        for (PlayerHand us : list) {
            listWinner.put(us, us.sumCards());
            System.out.println("sum - " + us.sumCards());
        }
        int win = 0;

        listWinner.forEach((k,v)-> System.out.println("k - " + k +" = "+ v));

        for (Map.Entry<PlayerHand, Integer> winner : listWinner.entrySet()) {
            if (win == 0) {
                winner.getValue();
            } else if (winner.getValue() > win) {
                win = winner.getValue();
                user = winner.getKey();
            }
        }
        System.out.println(user);
    }

    static List enterNumberOfPlayers() {
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
                //reader.close();
            } catch (Exception e) {
                System.out.println("Введенный символ не верный. Необходимо ввести целое число!.");
                users = false;
            }
        }
        return listPlayerHand;
    }

    static List firstDistributionOfCards(List<PlayerHand> listUser, Deck deck) {
        for (PlayerHand user : listUser) {
            user.setCards(deck.distributeOneCard());
            user.setCards(deck.distributeOneCard());
        }
        return listUser;
    }

    static void distributionOfCards(PlayerHand user, Deck deck) {
        user.setCards(deck.distributeOneCard());
        int sumCard = user.sumCards();
        System.out.println("user1 - " + user.getNamePlayer() + " сумма карт - " + sumCard);
        if (sumCard < 21) {
            System.out.println("Выдать карту: ДА или НЕТ?");
            try {
                String chek = checkWord(new BufferedReader(new InputStreamReader(System.in)).readLine());
                if (chek.equals("y")) {
                    distributionOfCards(user, deck);
                } else {
                    System.out.println("user2_1 - " + user.getNamePlayer() + " сумма карт - " + sumCard);
                }

            } catch (Exception e) {
                System.out.println("Что-то пошло не так!!!!!!!!!!!!!!!");
            }

        } else {
            System.out.println("user2_2 - " + user.getNamePlayer() + " сумма карт - " + sumCard);
        }

    }

    static String checkWord(String word) {

        if (word.equals("y") || word.equals("n")) {
            return word;
        } else {
            try {
                System.out.println("Введите верный символ!!!!");
                word = new BufferedReader(new InputStreamReader(System.in)).readLine();
                checkWord(word);
            } catch (Exception e) {
                checkWord(word);
            }
        }
        return word;
    }
}