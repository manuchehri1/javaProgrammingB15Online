package replIt;

import java.util.Scanner;

public class Repl_86 {
    public static void main(String[] args) {


//    Imagine you have a party and need to form the list of the guests.
//    (Assume you have at least one guest)
//    Ask for the first guest name.
//    Then ask does user want to enter one more guest.
//    If yes - take input from.
//    If not - finish the program and print list of the guests.
//    Example of the program:
//    Please enter guest name:
//    Nick
//    Do you want to enter new guest name:
//    yes
//    Please enter guest name:
//    Linda
//    Do you want to enter new guest name:
//    no
//    Guest's list: Nick, Linda
        Scanner scan = new Scanner(System.in);
        String name, moreGuest,newName;
        System.out.println("Please enter guest name: ");
         name = scan.nextLine();
        System.out.println("Do you want to enter new guest name:");
         moreGuest= scan.next();
        while (moreGuest.equalsIgnoreCase("yes")){
            System.out.println("Please enter guest name: ");
            newName= scan.nextLine();
            newName=scan.nextLine();
            System.out.println("Do you want to enter new guest name:");
            moreGuest= scan.next();
            name=name+", "+newName;

        }

        System.out.println(name);

//        System.out.println("does user want to enter one more guest");
//        moreGuest=scan.nextBoolean();
//        int x=0;
//        while (moreGuest==true){
//            System.out.println("Please enter guest name: ");
//            name=scan.next();
//            System.out.println("does user want to enter one more guest");
//            ++x;
//        }
//            System.out.println("Guest's list: "+name);
//        }

    }

}