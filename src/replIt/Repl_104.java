package replIt;

import java.util.Scanner;

public class Repl_104 {
    public static void main(String[] args) {
//        Example:
//        input:{"id": 1934, "firstName": "James", "lastName": "May","role": "student-team-member"}
//        output:
//        First name: James
//        Last name: May

        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();

        int indexOfName = json.indexOf("firstName");
        String preName= json.substring(indexOfName+13);
        String name= preName.substring(0,preName.indexOf("\""));
        System.out.println("First name: " + name);
        int indexOfSurname= json.indexOf("lastName");
        String preLastName= json.substring(indexOfSurname+12);
        String lastName=preLastName.substring(0,preLastName.indexOf("\""));
        System.out.println("Last name: " + lastName);


    }
}
