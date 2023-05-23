package exercise1;

import java.util.Random;
import java.util.Scanner;


public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];

        Random random = new Random();
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1); // Generates a random value between 1 and 13 (inclusive)
            card.setSuit(Card.SUITS[random.nextInt(4)]); // Generates a random suit from the SUITS array
            hand[i] = card;
        }

        // Ask the user to pick a card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card value (1-10, 11 for Jack, 12 for Queen, 13 for King): ");
        int value = scanner.nextInt();
        System.out.print("Pick a suit (1 for Hearts, 2 for Diamonds, 3 for Clubs, 4 for Spades): ");
        int suit = scanner.nextInt();

        // Create the user's card
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit - 1]);

        // Search for the user's card in the hand
        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, your card is not in the hand.");
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to
     * replace this information with your own.
     */
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        System.out.println("My name is Chirag, a computer science student.");
        System.out.println();
        System.out.println("My career ambitions:");
        System.out.println("-- to be a software developer");
        System.out.println("-- good bathroom dancer");
        System.out.println();
        System.out.println("My hobbies:");
        System.out.println("-- Coding");
        System.out.println("-- dancing");
        System.out.println("-- cooking");
        System.out.println();
    }

    //i am done
}
