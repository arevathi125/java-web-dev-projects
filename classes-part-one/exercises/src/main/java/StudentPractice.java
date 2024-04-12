public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student student = new Student("Revathi", 1, 1, 4.0);
        Student student1 = new Student("Vidhuna", 2, 10, 10.0);
        System.out.println("Name: "+student.getName());
        System.out.println("Id : "+student.getStudentId());

        Teacher teacher = new Teacher("Revathi","Anbazhagan","Maths",2);
        System.out.println("Teacher Name : "+teacher.getFirstName()+" "+teacher.getLastName());

        Course course = new Course("Maths",teacher);
        course.addStudent(student);
        course.addStudent(student1);

//        System.out.println(course.getEnrolledStudents().get(0).getName());
//        System.out.println(course.getEnrolledStudents().get(1).getName());

        for (Student s : course.getEnrolledStudents()){
            System.out.println(s.getName());
                    }
    }
}
