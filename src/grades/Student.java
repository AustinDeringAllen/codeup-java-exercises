package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<Integer>();
        attendance = new HashMap<String, String>();
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

    public void recordAttendance(String date, String value) {
        attendance.put(date, value.toUpperCase());
    }

    public double calculateAttendance() {
        int days = 0, absences = 0;
        for(HashMap.Entry<String, String> entry : attendance.entrySet()) {
            days++;
            if(entry.getValue().equalsIgnoreCase("a"))
                absences++;
        }

        return (double) (days - absences) / days;
    }

    public ArrayList<String> returnAbsences() {
        ArrayList<String> absences = new ArrayList<>();
        for(HashMap.Entry<String, String> entry : attendance.entrySet()) {
            if(entry.getValue().equalsIgnoreCase("a")) {
                absences.add(entry.getKey());
            }
        }

        return absences;
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
