package AdditinalTasks.customClass;

import java.util.Arrays;
import java.util.List;

public class School {
    String schoolName;

    List<Student> allStudentList;

    public School(String schoolName, List<Student> allStudentList) {
        this.schoolName = schoolName;
        this.allStudentList = allStudentList;
    }
    public  void addNewStudent(Student s){
        allStudentList.add(s);
    }
    public void addNewStudent( Student[] students){
        this.allStudentList.addAll(Arrays.asList(students));
    }
    public void addNewStudent( List<Student> students){
        this.allStudentList.addAll(students);
    }


    @Override
    public String toString() {
        return  ""+allStudentList ;
    }
}
