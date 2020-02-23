package office_hour_01_13_20;

public class Person {

    String firstName;
    String lastName;
    String DOB;


    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB='" + DOB + '\'' +
                '}';
    }
    public void printInfo(){
        System.out.println(String.format("String first name = %s, last name = %s, date of birth = %s",firstName, lastName, DOB));
    }
}
