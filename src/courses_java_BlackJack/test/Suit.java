package courses_java_BlackJack.test;

public enum Suit {

    CLUBS("Трефы"), // Трефы ("Трефы")
    DIAMONDS("Бубны"), // Бубны ("Бубны")
    HEARTS("Червы"), // Червы ("Червы")
    SPADES("Пики"); // Пики ("Пики")

    private String suit;

    Suit(String suit) {
        this.suit = suit;
    }
}
