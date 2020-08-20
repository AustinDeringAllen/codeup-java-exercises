package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static Input input = new Input();

    public static HashMap<String, Student> createData() {
        HashMap<String, Student> students = new HashMap<>();

        students.putIfAbsent("austinderingallen",new Student("Austin"));
        students.putIfAbsent("amarot",new Student("Amaro"));
        students.putIfAbsent("tracyt",new Student("Tracy"));
        students.putIfAbsent("dylanbirdmacenthusiast",new Student("Dylan"));

        for(HashMap.Entry<String, Student> entry : students.entrySet()) {
            for(int i=0; i<4; i++) {
                entry.getValue().addGrade((int) Math.floor(Math.random() * 70) + 31);
            }
        }

        return students;
    }

    public static String menu(HashMap<String, Student> students) {
        String userInput;

        System.out.println("-----USERS-----");
        for(Object username : students.keySet().toArray()) {
            System.out.println(username);
        }

        System.out.print("\nEnter user you would like to see: ");

        userInput = input.getString();
        if(!students.containsKey(userInput.toLowerCase())) {
            System.out.println("Invalid User. Try again.\n");
            userInput = menu(students);
        }

        return userInput;
    }

    public static void displayData(HashMap<String, Student> students, String userName) {
        Student student = students.get(userName);
        System.out.println("The students name is: " + student.getName());
        System.out.println("The students grade average is: " + student.getGradeAverage());
    }


    public static void main(String[] args) {
        HashMap<String, Student> students = createData();
        String userName;
        boolean run = true;

        do {
            // Intro
            System.out.println("Welcome to the grade application!");
            System.out.println("Please input the github username you'd like to see more info about.\n");

            // Menu Print
            userName = menu(students);

            // Display Data
            displayData(students, userName);

            // Input
            System.out.print("Continue? [Y/N]: ");
            run = input.yesNo();
        } while(run);
    }
}
