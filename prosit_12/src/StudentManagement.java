import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentManagement implements Management{

    @Override
    public void displayStudents(List<Student> students, Consumer<Student> con) {
        for (Student s : students) {
            con.accept(s);
        }
        // for i=0 i<student.size i++               con.accept(s.get(i))
    }

    @Override
    public void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con) {
        for(Student s : students) {
            if(pre.test(s)) {
                con.accept(s);
            }

        }
    }


    @Override
    public String returnStudentsNames(List<Student> students, Function<Student, String> fun) {
        StringBuilder sb = new StringBuilder();
        for (Student s : students) {
         sb.append(fun.apply(s))   ;
         sb.append("°°°°°");
        }
        return sb.toString();

    }

    @Override
    public Student createStudent(Supplier<Student> sup) {
       return sup.get();

    }

    @Override
    public List<Student> sortStudentsById(List<Student> students, Comparator<Student> com) {
        students.sort(com);
        return students;
    }

}
