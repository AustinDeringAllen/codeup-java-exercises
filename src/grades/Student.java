package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<Integer>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        int total = 0;
        for(int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }

    public static void main(String[] args) {
        Student austin = new Student("Austin");
        Student vanessa = new Student("Vanessa");

        austin.addGrade(100);
        austin.addGrade(100);
        austin.addGrade(97);
        austin.addGrade(95);
        System.out.println(austin.getName() + "'s average is: " + austin.getGradeAverage());

        vanessa.addGrade(92);
        vanessa.addGrade(87);
        vanessa.addGrade(100);
        vanessa.addGrade(70);
        System.out.println(vanessa.getName() + "'s average is: " + vanessa.getGradeAverage());
    }
}
