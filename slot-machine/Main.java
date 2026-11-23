
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static String[] symbols = {"🍒", "🔥", "🐦‍🔥", "🗿", "🫦", "🌟"};

    static double balance = 100;
    static double totalWinnings = 0;
    static double totalLosses = 0;

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("     WELCOME TO YOUNG HUSH");
        System.out.println("           CASINO!!");
        System.out.println("================================");

        System.out.print("Symbols: ");
        for (String symbol : symbols) {
            System.out.print(symbol + " ");
        }

        System.out.println("\nStarting balance: $" + balance);

        boolean playAgain = true;

        while (playAgain && balance > 0) {

            System.out.println("\nCurrent Balance: $" + balance);

            double bet = getBet();

            balance -= bet;

            String[] roll = spinReels();

            printReels(roll);

            double winnings = calculateWinnings(roll, bet);

            if (winnings > 0) {
                balance += winnings;
                totalWinnings += winnings;

                System.out.printf("You won: $%.2f%n", winnings);
            } else {
                totalLosses += bet;
                System.out.println("No match! Better luck next time.");
            }

            System.out.printf("Balance: $%.2f%n", balance);

            if (balance > 0) {
                playAgain = playAgain();
            }
        }

        System.out.println("\n================================");
        System.out.println("       CASINO SESSION OVER");
        System.out.println("================================");

        System.out.printf("Final Balance: $%.2f%n", balance);
        System.out.printf("Total Winnings: $%.2f%n", totalWinnings);
        System.out.printf("Total Losses: $%.2f%n", totalLosses);

        if (balance > 100) {
            System.out.println("You walked away with a profit!");
        } else if (balance < 100) {
            System.out.println("You ended the session at a loss.");
        } else {
            System.out.println("You broke even!");
        }

        System.out.println("Thanks for visiting Young Hush Casino!");

        scanner.close();
    }

    // Get and validate the player's bet
    static double getBet() {

        double bet;

        while (true) {

            System.out.print("Place your bet: ");

            if (scanner.hasNextDouble()) {
                bet = scanner.nextDouble();

                if (bet > 0 && bet <= balance) {
                    return bet;
                }

                System.out.println("Bet must be positive and within your balance!");

            } else {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }
        }
    }

    // Generate three random symbols
    static String[] spinReels() {

        String[] roll = new String[3];

        for (int i = 0; i < roll.length; i++) {
            int number = random.nextInt(symbols.length);
            roll[i] = symbols[number];
        }

        return roll;
    }

    // Display the reels
    static void printReels(String[] roll) {

        System.out.println("\n+-----------------------+");
        System.out.println("|       SPINNING        |");
        System.out.println("+-----------------------+");

        for (String symbol : roll) {
            System.out.print("|  " + symbol + "  ");
        }

        System.out.println("|");
        System.out.println("+-----------------------+");
    }

    // Calculate winnings
    static double calculateWinnings(String[] roll, double bet) {

        boolean allMatch =
                roll[0].equals(roll[1]) &&
                roll[1].equals(roll[2]);

        boolean twoMatch =
                roll[0].equals(roll[1]) ||
                roll[1].equals(roll[2]) ||
                roll[0].equals(roll[2]);

        if (allMatch) {

            System.out.println("JACKPOT! ALL THREE MATCH!");

            return bet * 5;

        } else if (twoMatch) {

            System.out.println("Two symbols matched!");

            return bet * 2;

        }

        return 0;
    }

    // Ask whether the player wants another round
    static boolean playAgain() {

        while (true) {

            System.out.print("\nPlay another round? (Y/N): ");

            String answer = scanner.next();

            if (answer.equalsIgnoreCase("Y")) {
                return true;
            }

            if (answer.equalsIgnoreCase("N")) {
                return false;
            }

            System.out.println("Please enter Y or N.");
        }
    }
}
