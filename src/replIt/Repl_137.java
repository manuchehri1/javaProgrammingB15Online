package replIt;

import java.util.Scanner;

public class Repl_137 {
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
        String reverse="";
        String[] arr=sentence.split(" ");
        for (int i =arr.length-1; i >=0 ; i--) {
            reverse+=arr[i]+" ";
        }
       reverse= reverse.substring(0,reverse.length()-1);
        System.out.println(reverse);



    }
}
