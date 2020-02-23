package replIt;

import java.util.Scanner;

public class Repl_88_new {
    public static void main(String[] args) {
//
//        Print true if the string "cat" and "dog" appear the same number
//        of times in the given string word.
//                Example:
//        input: catdog
//        output: true
//
//        Example:
//        input: catcat
//        output: false
//
//        Example:
//        input: cat-cheetah-dog-cat
//        output: false


        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int catCount=0;
        int dogCount=0;
                       //01234567891
        //        input: cat-cheetah-dog-cat

        for (int i = 0; i <word.length()-2; i++) {
            if (word.substring(i,i+3).equalsIgnoreCase("cat")){
                ++catCount;
            }else if (word.substring(i,i+3).equalsIgnoreCase("dog")){
                ++dogCount;
            }
        }

        if (catCount==dogCount){
            System.out.println(true);
        }else {
            System.out.println(false);
        }





    }
}
