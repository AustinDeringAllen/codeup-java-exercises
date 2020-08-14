package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("Input a string: ");
        String string = input.getString();
        System.out.println("Your string is: " +string);

        System.out.print("Input yes, y, true, or any thing else: ");
        boolean bool = input.yesNo();
        System.out.println("Your input equates to: " +bool);

        System.out.print("Input a whole number: ");
        int whole = input.getInt();
        System.out.println("Your number is: " +whole);

        whole = input.getInt(1,20);
        System.out.println("Your number is: " +whole);

        System.out.print("Input a floating point number: ");
        double decimal = input.getDouble();
        System.out.println("Your number is: " +decimal);

        decimal = input.getDouble(1,5);
        System.out.println("Your number is: " +decimal);
    }
}
