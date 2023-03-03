package h8.abstractclass_interface.exercise_7;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Subject> subjectList1 = new ArrayList<>(List.of(
                new Subject("math", 20),
                new Subject("eng", 10),
                new Subject("history", 40)));


        Student student1 = new Student("Arman", "Hambardzumyan", subjectList1);
        Student student2 = new Student("Tatul", "Poghosyan");

        System.out.println(student1.getPercentage());
    }
}
