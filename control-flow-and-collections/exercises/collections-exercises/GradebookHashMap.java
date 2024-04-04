import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradebookHashMap {

    public static void main(String[] args) {
     HashMap<Integer,String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studName;

        System.out.println("Enter your students Id (or ENTER to finish) : ");

        do{
            System.out.println("Student name : ");
             studName = input.nextLine();

            if (!studName.equals("")){
                System.out.println("Student Id : ");
               Integer studentId = input.nextInt();
                students.put(studentId,studName);
                input.nextLine();
            }
        } while (!studName.equals(""));

        input.close();
        System.out.println("\nClass roster : ");
        //double sum = 0.0;

        for(Map.Entry<Integer,String> student : students.entrySet()){
            System.out.println(student.getValue()+"'s Id : "+student.getKey());
        }
        System.out.println("Number of students in roster : "+students.size());
    }
}
