import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        final double pi = 3.14159;

        //        System.out.printf("The approximate value of pi is %.4s.\n",pi);
        //
        //        // SECOND EXERCISE
        Scanner scanner = new Scanner(System.in);
        //        System.out.println("Enter an Integer: ");
        //
        //        boolean integer = true;
        //
        //        try {
        //            int userInput = scanner.nextInt();
        //        } catch(Exception error) {
        //            System.out.println("" + error);
        //            integer = false;
        //        }
        //
        //        if(integer) {
        //            System.out.println("Congratulations on entering an Integer");
        //        } else {
        //            System.out.println("I told you to enter an Integer...");
        //        }
        //
        //        String wordOne = "", wordTwo = "", wordThree = "";
        //        System.out.println("Please enter 3 words");
        //        try {
        //            wordOne = scanner.next();
        //            wordTwo = scanner.next();
        //            wordThree = scanner.next();
        //        } catch(Exception error) {
        //            System.out.println("" + error);
        //        }
        //        System.out.printf("First Word: %s\nSecond Word: %s\nThird Word: %s", wordOne, wordTwo, wordThree);
        //        scanner.nextLine();
        //
        //        String userSentence = "";
        //        try {
        //            System.out.println("\n\nPlease Enter a sentence: ");
        //            userSentence = scanner.nextLine();
        //        } catch(Exception error) {
        //            System.out.println("" + error);
        //        }
        //
        //        System.out.printf("The sentence entered is: \n%s", userSentence);

        // THIRD EXERCISE
        int length = 0, width = 0;
        System.out.println("\n\nPlease enter a length and a width: ");
        try {
            length = scanner.nextInt();
            width = scanner.nextInt();
        } catch(Exception error) {
            System.out.println("" + error);
        }

        int perimeter = length + length + width + width;
        int area = length * width;

        System.out.printf("The perimeter is: %s\nThe area is: %s", perimeter, area);
    }
}
