package AdditinalTasks.customClass;

//Task1:
//        create a class called Student:
//        instance variables: String studentName
//        initialize the ins variable within a constructor
//        create a class called School:
//        instance variables: String schoolName
//        List<Student> AllStudentsList;
//        initialize instance variables within a constrcutor
//        create a method called addNewStudent() that can add students to the AllStudentsList
//        create a class called AssociationExample:
//        create 5 objects of the students class
//creata a List of students called CybertekStudents and store those 5 objects into the List
//        create the object of the School and initialize school name to "Cybertek"
//        add two more new students "Denis" and "Irina" to cybertek school' student list
//        use for each loop to print out entire cybertek student' names

public class Student {
    String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentName ;
    }
}
