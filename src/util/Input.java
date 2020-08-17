package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public Boolean yesNo() {
        String input = getString();
        System.out.println(input);
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("true") || input.equalsIgnoreCase(("t"));
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public int getInt(int min, int max) {
        int input = scanner.nextInt();

        if (input < min || input > max) {
            System.out.println("Error: Invalid Input");
            input = getInt(min, max);
        }

        return input;
        // Could refactor this to call getInt(); So cool.
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        System.out.print("Enter a number between " +min+ " and " +max+ ": ");
        double input = scanner.nextDouble();

        if(input < min || input > max)
            input = getDouble(min, max);

        return input;
    }
}
