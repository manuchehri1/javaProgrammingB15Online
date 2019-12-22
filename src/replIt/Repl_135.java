package replIt;

import java.util.Scanner;

public class Repl_135 {
    public static void main(String[] args) {
//        Given a String variable sentence, write code to type each word in separate lines.
//
//        Example:
//        sentence -> "Java is fun"
//        Print
//        Java
//        is
//        fun
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below
        String[] arr=sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }





    }
}
