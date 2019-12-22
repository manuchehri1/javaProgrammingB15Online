package replIt;

import java.util.Scanner;

public class Repl_106_My_Own {
    public static void main(String[] args) {


//        Inputs:
//        String word;
//
//        Write a for loop that will loop through every letter of the input
//        and print out just the vowels. Sample input/outputs
//        In: howdyho
//                oo
//
//        In: huehuehuehue
//                ueueueue
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        for (int i = 0; i <word.length() ; i++) {
            char vowel=word.charAt(i);
            if (vowel=='a'|| vowel=='e'|| vowel=='i' || vowel=='o'|| vowel=='u'){
                System.out.print(vowel);
            }

        }




    }
}
