import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "L", 20));
        students.add(new Student(2, "lou", 23));
        students.add(new Student(3, "louay", 22));


        StudentManagement sm = new StudentManagement();


        System.out.println("All Students:");
        sm.displayStudents(students, System.out::println);


        System.out.println("\nStudents older than 21:");
        sm.displayStudentsByFilter(
                students,
                s -> s.getAge() > 21,
                System.out::println
        );


        System.out.println("\nConcatenated Student Names:");
        String names = sm.returnStudentsNames(students, Student::getName);
        System.out.println(names);


        System.out.println("\nCreating a new Student:");
        Student newStudent = sm.createStudent(() -> new Student(4, "lewy", 21));
        System.out.println(newStudent);


        System.out.println("\nStudents sorted by ID:");
        List<Student> sortedStudents = sm.sortStudentsById(students, Comparator.comparingInt(Student::getId));
        sm.displayStudents(sortedStudents, System.out::println);
    }
}
