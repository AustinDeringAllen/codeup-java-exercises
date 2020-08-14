package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        boolean active = true;
        Circle circle;

        System.out.print("Please enter a radius for a new circle: ");
        circle = new Circle(input.getDouble());
        System.out.println("The Area of the circle is: " + circle.getArea());
        System.out.println("The circumference of the circle is: " + circle.getCircumference());
    }
}
