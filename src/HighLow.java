import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    private static Scanner scanner;

    public static void setScanner(Scanner s) {
        scanner = s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        setScanner(scanner);
        int randomNumber = (int) (Math.random() * 100) + 1;
        int userGuess = 0;

        while(true) {
            System.out.println("Please guess the random number: ");
            userGuess = scanner.nextInt();
            if(userGuess < 1 || userGuess > 100)
                System.out.println("Your guess is out of the guessing bounds. Try again.");
            else {
                String results = checkGuess(userGuess, randomNumber);
                if(results.equalsIgnoreCase("you guessed correctly!")) {
                    System.out.println(results);
                    break;
                } else {
                    System.out.println(results);
                }
            }
        }

        checkGuess(userGuess, randomNumber);
    }

    public static String checkGuess(int guess, int targetNumber) {
        if(guess == targetNumber) {
            return "You guessed correctly!";
        } else if(guess < targetNumber) {
            return "Higher...";
        } else if(guess > targetNumber) {
            return "Lower...";
        }
        return "error";
    }
}
