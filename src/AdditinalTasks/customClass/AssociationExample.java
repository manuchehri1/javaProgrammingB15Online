package AdditinalTasks.customClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssociationExample {
    public static void main(String[] args) {

        Student s1= new Student("Ali");
        Student s2= new Student("Hasan");
        Student s3= new Student("Vali");
        Student s4= new Student("Mim");
        Student s5= new Student("Nun");


        List<Student> CybertekStudents= new ArrayList<>();

        CybertekStudents.addAll(Arrays.asList(s1,s2,s3,s4,s5));

        School school1 = new School("Cybertek",CybertekStudents);
        school1.addNewStudent(new Student("Denis"));
        school1.addNewStudent(new Student("Irina"));



        for (Student each : school1.allStudentList ) {
            System.out.println(each);
        }
    }
}
