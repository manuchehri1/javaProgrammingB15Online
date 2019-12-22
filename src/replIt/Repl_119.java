package replIt;

import java.util.Scanner;

public class Repl_119 {
    public static void main(String[] args) {

//        Given a String variable email, write code using split method to print email id and
//        domain in separate lines.
//                Example:
//        email -> info@cybertekschool.com
//        Print:
//        Email id: info
//        Email domain: cybertekschool.com
//        If email contains no @ character or multiple @ characters then print invalid email:
//        email -> hello-gmail.com
//        print:
//        invalid email
//        email -> my@fancy@email.com
//        print:
//        invalid email
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        int indexOfAT= email.indexOf("@");
        int countofAT=0;
        for (int i = 0; i < email.length(); i++) {
            if (email.substring(i,i+1).equals("@")){
                countofAT++;
            }
        }
        if (countofAT<1 || countofAT>1){
            System.out.println("invalid email");
        }else {
            System.out.println("Email id: "+email.substring(0,indexOfAT));
            System.out.println("Email domain: "+email.substring(indexOfAT+1));
        }


    }
}
