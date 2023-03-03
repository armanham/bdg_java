package h8.abstractclass_interface.exercise_7;

import java.util.List;

public class Student extends Marks {

    private String firstName;

    private String lastName;

    private List<Subject> subjects;

    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, List<Subject> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public double getPercentage() {
        double sumMarks = 0;
        for (int i = 0; i < subjects.size(); i++) {
            sumMarks += subjects.get(i).getMark();
        }
        return sumMarks / subjects.size();
    }
}
