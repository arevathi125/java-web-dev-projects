import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String subject;

    public Course(String subject, Teacher instructor) {
        this.subject = subject;
        this.instructor = instructor;
           }

    private Teacher instructor;

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course course)) return false;
        return Objects.equals(subject, course.subject) && Objects.equals(instructor, course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, instructor);
    }

    public void addStudent(Student student){
        enrolledStudents.add(student);
    }
}
