import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        // Shows the location in memory without to string;
        System.out.println(Arrays.toString(numbers));

        String[] names = {"Austin","Dylan","Christian"};
        Person[] people = new Person[names.length];

        for(int i=0; i<people.length; i++) {
            people[i] = new Person(names[i]);
        }

        for(Person person : people) {
            System.out.println(person.getName());
        }

        Person newPerson = new Person("Daniel");
        people = addPerson(people, newPerson);

        for(Person person : people) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] tempArray = new Person[people.length + 1];
        for(int i=0; i<people.length; i++) {
            tempArray[i] = people[i];
        }
        tempArray[tempArray.length-1] = newPerson;
        return tempArray;
    }
}
