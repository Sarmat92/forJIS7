package JavaHomework.Lectures_20.Optional.Repository;

import JavaHomework.Lectures_20.Optional.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    public static List<Student> studentList = new ArrayList<>();

    public static void initializeStudent() {
        studentList.add(new Student("Max", "Pirogov", 25));
        studentList.add(new Student(null, "Gromov", null));
        studentList.add(new Student("Alex", null, 28));
        studentList.add(new Student("Stas", "Bobrov", null));
        studentList.add(new Student());
    }
}
