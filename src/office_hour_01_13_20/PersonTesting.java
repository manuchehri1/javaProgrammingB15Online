package office_hour_01_13_20;

public class PersonTesting {
    public static void main(String[] args) {

        Person p1= new Person();
        Person p2 =new Person();
        Person p3 = new Person();

        p1.firstName="James";
        p1.lastName="Bond";
        p1.DOB="01/13/1980";

        p1.printInfo();
        p2.printInfo();


    }
}
