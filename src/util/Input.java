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
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("true") || input.equalsIgnoreCase(("t"));
    }

    public int getInt() {
        int number;
        try {
            number = Integer.parseInt(getString());
        } catch(NumberFormatException e) {
            throw new NumberFormatException("Number entered was not a number");
        }
        return number;
    }

    public int getInt(int min, int max) {
        int number = getInt();

        if (number < min || number > max) {
            System.out.println("Error: Invalid Input");
            number = getInt(min, max);
        }

        return number;
    }

    public double getDouble() {
        double number;
        try {
            number = Double.parseDouble(getString());
        } catch(NumberFormatException e) {
            throw new NumberFormatException("Input could not be parsed to a number");
        }
        return number;
    }

    public double getDouble(double min, double max) {
        System.out.print("Enter a number between " +min+ " and " +max+ ": ");
        double number;

        try {
            number = Double.parseDouble(getString());
        } catch(NumberFormatException e) {
            throw new NumberFormatException("Input could not be parsed to a number");
        }

        if(number < min || number > max)
            number = getDouble(min, max);

        return number;
    }

    public String getBinary() {
        int number;
        try {
            number = Integer.valueOf(getString());
        } catch(NumberFormatException e) {
            throw new NumberFormatException("Input could not be parsed to a number");
        }

        return Integer.toBinaryString(number);
    }
}
