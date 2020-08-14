import java.util.Random;

public class ServerNameGenerator {
    private static final String[] adjectives = {"happy","sad","angry","spiteful","smelly","bright","dim", "scented","dumb","smart"};
    private static final String[] nouns = {"house","baguette","star","gorilla","zebra","otter","horse","snake","car","plane"};

    public static String randomElement(String[] array) {
        Random random = new Random();
        return array[random.nextInt(array.length)];
    }

    public static void main(String[] args) {
        System.out.printf("Your server name is: %s-%s",randomElement(adjectives),randomElement(nouns));
    }
}
