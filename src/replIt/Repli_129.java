package replIt;

import java.util.Arrays;

public class Repli_129 {
    public static void main(String[] args) {
//        Given a String array arr with the following elements
//                ["zero", "one", "two","three","four"]
//
//        Create another array fewValues and copy words that have letter "e" in them
//
//        You need to know how many element contain "e" and create array accordingly
//
//        Values in fewValues array need to be["zero", "one","three"]
//
//        Examples:
//        arr -> ["aa", "be", "lol", "lel", "oreo"]
//        fewValues -> ["be",  "lel", "oreo"]
//
//        arr -> ["e", "hey", "bye", "furey", "spoon"]
//        fewValues ->["e", "hey", "bye", "furey"]

        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two","three","four"};
        System.out.println(Arrays.toString((numbers)));

        int countOfE=0;
        String wordsWithE="";

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].contains("e")){
                wordsWithE=wordsWithE+numbers[i]+" ";
                countOfE++;
            }
        }
        String withoutSpace=wordsWithE.substring(0,wordsWithE.length()-1);
        String[] fewValues=withoutSpace.split(" ");
        System.out.println(Arrays.toString(fewValues));




    }
}
