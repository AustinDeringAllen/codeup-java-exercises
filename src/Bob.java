import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean talk = true;
        String input = "";

        System.out.println("Type exit to leave bob alone.");
        do {
            System.out.println("Say something to say to bob:");
            input = scanner.nextLine();

            if(input.equalsIgnoreCase("exit")) {
                talk = false;
            }

            if(input.trim().endsWith("?")) {
                System.out.println("Sure.");
            } else if(input.trim().endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if(input.trim().equalsIgnoreCase("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
        } while(talk);
    }
}
