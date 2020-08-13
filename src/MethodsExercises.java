import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        exerciseOne();
//        exerciseTwo();
        exerciseThree();
    }

    public static void exerciseOne() {
        System.out.println(add(2,2));
        System.out.println(subtract(4,1));
        System.out.println(multiply(3,3));
        System.out.println(multiplyWithoutMultiply(3,4));
        System.out.println(divide(4,1));
        System.out.println(modulo(9,2));
    }

    public static void exerciseTwo() {
        int userInput = getInteger(1,10);
        System.out.println("Number entered: " + userInput);
    }

    public static void exerciseThree() {
        int userInput = getInteger(1,10);
        factorial(userInput);

    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int multiplyWithoutMultiply(int x, int y) {
        int total = 0;
        for(int i = 0; i<y; i++) {
            total += x;
        }
        return total;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int modulo(int x, int y) {
        return x % y;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int input = -1;

        System.out.print("Enter a number between " + min + " and " + max + ": ");
        input = Integer.parseInt(scanner.nextLine());
        System.out.println();

        if(input < min || input > max) {
            input = getInteger(min,max);
        }

        return input;
    }

    public static void factorial(int number) {
        for (int i = 1; i <= number; i++) {
            int total = 1;
            String s = "";
            System.out.print("" + i + "! = ");
            for (int j = 1; j <= i; j++) {
                total = total * j;
                if (j == 1)
                    s += j;
                else
                    s += " x " + j;
            }
            System.out.print(s);
            System.out.print(" = " + total);
            System.out.println();
        }
    }
}
