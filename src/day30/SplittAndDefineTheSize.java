package day30;

import java.util.Arrays;

public class SplittAndDefineTheSize {
    public static void main(String[] args) {



        String sentence = "I love Java Java Java";

        //String[] wordsArray = sentence.split(" ");
        String[] wordsArray = sentence.split(" ",2);


       System.out.println("wordsArray = " + Arrays.toString(wordsArray));





    }
}
